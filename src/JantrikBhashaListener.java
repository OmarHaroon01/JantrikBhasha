// Generated from JantrikBhasha.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JantrikBhashaParser}.
 */
public interface JantrikBhashaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(JantrikBhashaParser.PrimaryExpressionContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(JantrikBhashaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JantrikBhashaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JantrikBhashaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(JantrikBhashaParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(JantrikBhashaParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JantrikBhashaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JantrikBhashaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(JantrikBhashaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(JantrikBhashaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JantrikBhashaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JantrikBhashaParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JantrikBhashaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JantrikBhashaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JantrikBhashaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JantrikBhashaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JantrikBhashaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JantrikBhashaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JantrikBhashaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JantrikBhashaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JantrikBhashaParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JantrikBhashaParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JantrikBhashaParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JantrikBhashaParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JantrikBhashaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JantrikBhashaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JantrikBhashaParser.AssignmentExpressionContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JantrikBhashaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JantrikBhashaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JantrikBhashaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JantrikBhashaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JantrikBhashaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JantrikBhashaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JantrikBhashaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JantrikBhashaParser.DeclarationContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JantrikBhashaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(JantrikBhashaParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(JantrikBhashaParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(JantrikBhashaParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(JantrikBhashaParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(JantrikBhashaParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(JantrikBhashaParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(JantrikBhashaParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(JantrikBhashaParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(JantrikBhashaParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(JantrikBhashaParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(JantrikBhashaParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(JantrikBhashaParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(JantrikBhashaParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(JantrikBhashaParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(JantrikBhashaParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(JantrikBhashaParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(JantrikBhashaParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(JantrikBhashaParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(JantrikBhashaParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(JantrikBhashaParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(JantrikBhashaParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(JantrikBhashaParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(JantrikBhashaParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(JantrikBhashaParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(JantrikBhashaParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(JantrikBhashaParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JantrikBhashaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JantrikBhashaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(JantrikBhashaParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(JantrikBhashaParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(JantrikBhashaParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(JantrikBhashaParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JantrikBhashaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JantrikBhashaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(JantrikBhashaParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(JantrikBhashaParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JantrikBhashaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JantrikBhashaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(JantrikBhashaParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(JantrikBhashaParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(JantrikBhashaParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(JantrikBhashaParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(JantrikBhashaParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(JantrikBhashaParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JantrikBhashaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JantrikBhashaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(JantrikBhashaParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(JantrikBhashaParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(JantrikBhashaParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(JantrikBhashaParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(JantrikBhashaParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(JantrikBhashaParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(JantrikBhashaParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(JantrikBhashaParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(JantrikBhashaParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(JantrikBhashaParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(JantrikBhashaParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(JantrikBhashaParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JantrikBhashaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JantrikBhashaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(JantrikBhashaParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(JantrikBhashaParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(JantrikBhashaParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(JantrikBhashaParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(JantrikBhashaParser.FunctionDefinitionContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(JantrikBhashaParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JantrikBhashaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(JantrikBhashaParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JantrikBhashaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(JantrikBhashaParser.DeclarationListContext ctx);
}