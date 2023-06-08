import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTableCreator extends JantrikBhashaBaseListener {
    private static class Variable {
        private String name;
        private String type;

        public Variable(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String toString() {
            return this.name + " " + this.type + "\n";
        }
    }

    private Map<String, SymbolTable> symbolTables;
    private Stack<String> scopeStack;

    public void createSymbolTable(String sourceCode) {
        JantrikBhashaLexer lexer = new JantrikBhashaLexer(CharStreams.fromString(sourceCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JantrikBhashaParser parser = new JantrikBhashaParser(tokens);
        SyntaxErrorListener errorListener = new SyntaxErrorListener();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.compilationUnit();

        if (!errorListener.hasSyntaxErrors()) {
            symbolTables = new HashMap<>();
            scopeStack = new Stack<>();
            SymbolTable globalSymbolTable = new SymbolTable();
            symbolTables.put("Global", globalSymbolTable);
            scopeStack.push("Global");

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(this, tree);
        } else {
            System.exit(1);
        }


    }

    @Override
    public void enterFunctionDefinition(JantrikBhashaParser.FunctionDefinitionContext ctx) throws Exception {
        String functionName = ctx.declarator().directDeclarator().directDeclarator().Identifier().getText();
        String scope = scopeStack.peek();
        SymbolTable currentSymbolTable = symbolTables.get(scope);
        if (currentSymbolTable.getVariable(functionName) != null){
            throw new Exception("Redeclaration of variable '" + functionName + "' in line " + ctx.start.getLine());
        }
        currentSymbolTable.addVariable(new Variable(functionName, "Function"));
        SymbolTable functionSymbolTable = new SymbolTable();
        symbolTables.put(functionName, functionSymbolTable);
        String parentScope = scopeStack.peek();
        functionSymbolTable.setParentScope(parentScope);
        scopeStack.push(functionName);

        // Add function parameters to the function scope
        JantrikBhashaParser.ParameterTypeListContext paramListContext = ctx.declarator().directDeclarator().parameterTypeList();
        if (paramListContext != null) {
            for (JantrikBhashaParser.ParameterDeclarationContext paramContext : paramListContext.parameterList().parameterDeclaration()) {
                String paramType = paramContext.declarationSpecifiers().getText();
                String paramName = paramContext.declarator().getText();
                Variable parameter = new Variable(paramName, paramType);
                functionSymbolTable.addVariable(parameter);
            }
        }
    }

    @Override
    public void exitFunctionDefinition(JantrikBhashaParser.FunctionDefinitionContext ctx) {
        scopeStack.pop();
    }

    @Override
    public void enterCompoundStatement(JantrikBhashaParser.CompoundStatementContext ctx) {
        if (!ctx.getParent().getClass().getSimpleName().replace("Context", "").equals("FunctionDefinition")) {
            String scopeName = "Block " + ctx.start.getLine();
            SymbolTable functionSymbolTable = new SymbolTable();
            symbolTables.put(scopeName, functionSymbolTable);
            String parentScope = scopeStack.peek();
            functionSymbolTable.setParentScope(parentScope);
            scopeStack.push(scopeName);
        }
    }

    @Override
    public void exitCompoundStatement(JantrikBhashaParser.CompoundStatementContext ctx) {
        if (!ctx.getParent().getClass().getSimpleName().replace("Context", "").equals("FunctionDefinition"))
            scopeStack.pop();
    }

    @Override
    public void enterPrimaryExpression(JantrikBhashaParser.PrimaryExpressionContext ctx) throws Exception {
        if (ctx.Identifier() != null) {
            String variableName = ctx.Identifier().getText();
            String scope = scopeStack.peek();
            SymbolTable currentSymbolTable = symbolTables.get(scope);
            Boolean variableDefined = false;
            while(currentSymbolTable.getParentScope() != null) {
                if (currentSymbolTable.getVariable(variableName) != null) {
                    variableDefined = true;
                    break;
                }
                currentSymbolTable = symbolTables.get(currentSymbolTable.getParentScope());
            }
            if (currentSymbolTable.getVariable(variableName) != null) {
                variableDefined = true;
            }
            if (!variableDefined)
                throw new Exception(variableName + " was not declared in this scope in line " + ctx.start.getLine());
        }
    }

    @Override
    public void enterDeclaration(JantrikBhashaParser.DeclarationContext ctx) throws Exception {
        String type = ctx.declarationSpecifiers().getText();
        String scope = scopeStack.peek();

        for (JantrikBhashaParser.InitDeclaratorContext initDeclaratorContext : ctx.initDeclaratorList().initDeclarator()) {
            String variableName = initDeclaratorContext.declarator().directDeclarator().Identifier().getText();
            Variable variable = new Variable(variableName, type);
            SymbolTable currentSymbolTable = symbolTables.get(scope);
            if (currentSymbolTable.getVariable(variableName) != null){
                if (currentSymbolTable.getVariable(variableName).getType().equals(type))
                    throw new Exception("Redeclaration of variable '" + variableName + "' in line " + ctx.start.getLine());
                else
                    throw new Exception("Conflicting declaration of variable '" + variableName + "' in line " + ctx.start.getLine());
            }
            currentSymbolTable.addVariable(variable);
        }
    }

    @Override
    public void enterAssignmentExpression(JantrikBhashaParser.AssignmentExpressionContext ctx) throws Exception {
        JantrikBhashaParser.UnaryExpressionContext unaryExprCtx = ctx.unaryExpression();
        if (unaryExprCtx != null && unaryExprCtx.postfixExpression() != null) {
            String LHS = unaryExprCtx.postfixExpression().primaryExpression().getText();
            if (!isProperIdentifier(LHS)) {
                throw new Exception("lvalue required as left operand in line " + unaryExprCtx.postfixExpression().primaryExpression().start.getLine());
            }
        }
    }

    public static boolean isProperIdentifier(String identifier) {
        // Check if the first character is a valid Java identifier start
        if (!Character.isJavaIdentifierStart(identifier.charAt(0))) {
            return false;
        }

        // Check the remaining characters
        for (int i = 1; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            // Check if the character is a valid Java identifier part
            if (!Character.isJavaIdentifierPart(ch) && !isBanglaCharacter(ch)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isBanglaCharacter(char ch) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(ch);
        return block == Character.UnicodeBlock.BENGALI;
    }



    private boolean isConstant(String expression) {
        // Implement logic to determine if the expression is a constant
        // For example, you can check if it's an integer literal
        try {
            Integer.parseInt(expression);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static class SymbolTable {
        private String parentScope;
        private ArrayList<Variable> variables;

        public SymbolTable() {
            variables = new ArrayList<>();
        }

        public int getSize() {
            return variables.size();
        }

        public void addVariable(Variable variable) {
            variables.add(variable);
        }

        public void setParentScope(String parentScope){
            this.parentScope = parentScope;
        }

        public String getParentScope() {
            return parentScope;
        }

        public Variable getVariable(String name) {
            for (int i = 0; i < variables.size(); i++) {
                if (name.equals(variables.get(i).getName())) {
                    return variables.get(i);
                }
            }
            return null;
        }

        public Iterable<Variable> getVariables() {
            return variables;
        }
    }

    public static void main(String[] args) {
        String sourceCode = "বাস্তবসংখ্যা শুরু () {\n" +
                "    বাস্তবসংখ্যা ক, খ;\n" +
                "    যদি (ক > খ) {\n" +
                "        ক = ১;\n" +
                "    } নয়তো {\n" +
                "        খ = ১;\n" +
                "    }\n" +
                "}";

        SymbolTableCreator symbolTableCreator = new SymbolTableCreator();
        symbolTableCreator.createSymbolTable(sourceCode);

        System.out.println("Symbol Table for the given code:");

        Map<String, SymbolTable> symbolTables = symbolTableCreator.symbolTables;
        for (Map.Entry<String, SymbolTable> entry : symbolTables.entrySet()) {
            String scope = entry.getKey();
            SymbolTable symbolTable = entry.getValue();


            System.out.println("Scope: " + scope);
            System.out.println("Parent Scope: " + symbolTable.getParentScope());
            System.out.println("Variables:");
            if (symbolTable.getSize() == 0){
                System.out.println();
                continue;
            }
            for (Variable variable : symbolTable.getVariables()) {
                System.out.println(variable.getName() + " - Type: " + variable.getType());
            }
            System.out.println();
        }
    }
}
