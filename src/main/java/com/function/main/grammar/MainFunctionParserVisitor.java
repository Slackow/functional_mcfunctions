// Generated from D:/code/mcfunction_lambdas/src/main/antlr\MainFunctionParser.g4 by ANTLR 4.7.2
package com.function.main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainFunctionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainFunctionParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainFunctionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MainFunctionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(MainFunctionParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#assert_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_line(MainFunctionParser.Assert_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#ending_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnding_line(MainFunctionParser.Ending_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#function_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_class(MainFunctionParser.Function_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#gen_mcfunction_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_mcfunction_line(MainFunctionParser.Gen_mcfunction_lineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionClassLine}
	 * labeled alternative in {@link MainFunctionParser#class_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionClassLine(MainFunctionParser.FunctionClassLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorClassLine}
	 * labeled alternative in {@link MainFunctionParser#class_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorClassLine(MainFunctionParser.ConstructorClassLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantLine}
	 * labeled alternative in {@link MainFunctionParser#class_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantLine(MainFunctionParser.ConstantLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationMod}
	 * labeled alternative in {@link MainFunctionParser#var_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationMod(MainFunctionParser.VarDeclarationModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationModPlusPlus}
	 * labeled alternative in {@link MainFunctionParser#var_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationModPlusPlus(MainFunctionParser.VarDeclarationModPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationListItem}
	 * labeled alternative in {@link MainFunctionParser#var_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationListItem(MainFunctionParser.VarDeclarationListItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationListItemPlusPlus}
	 * labeled alternative in {@link MainFunctionParser#var_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationListItemPlusPlus(MainFunctionParser.VarDeclarationListItemPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationObjectItem}
	 * labeled alternative in {@link MainFunctionParser#var_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationObjectItem(MainFunctionParser.VarDeclarationObjectItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationObjectItemPlusPlus}
	 * labeled alternative in {@link MainFunctionParser#var_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationObjectItemPlusPlus(MainFunctionParser.VarDeclarationObjectItemPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(MainFunctionParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MainFunctionParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#expr_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_block(MainFunctionParser.Expr_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(MainFunctionParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MainFunctionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(MainFunctionParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#foreach_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_loop(MainFunctionParser.Foreach_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(MainFunctionParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(MainFunctionParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#log_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_line(MainFunctionParser.Log_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#function_call_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_line(MainFunctionParser.Function_call_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#function_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_line(MainFunctionParser.Function_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainFunctionParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(MainFunctionParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandText}
	 * labeled alternative in {@link MainFunctionParser#command_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandText(MainFunctionParser.CommandTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandIdInterpPart}
	 * labeled alternative in {@link MainFunctionParser#command_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandIdInterpPart(MainFunctionParser.CommandIdInterpPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandExprInterpPart}
	 * labeled alternative in {@link MainFunctionParser#command_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandExprInterpPart(MainFunctionParser.CommandExprInterpPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommmandGoOnPart}
	 * labeled alternative in {@link MainFunctionParser#command_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommmandGoOnPart(MainFunctionParser.CommmandGoOnPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negationExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpr(MainFunctionParser.NegationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getFromObjectExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFromObjectExpr(MainFunctionParser.GetFromObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MainFunctionParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MainFunctionParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MainFunctionParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MainFunctionParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(MainFunctionParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elvisExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpr(MainFunctionParser.ElvisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(MainFunctionParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MainFunctionParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(MainFunctionParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code runFunctionExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunFunctionExpr(MainFunctionParser.RunFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(MainFunctionParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(MainFunctionParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpr(MainFunctionParser.IsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getItemExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetItemExpr(MainFunctionParser.GetItemExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MainFunctionParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MainFunctionParser#expr()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MainFunctionParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAtom(MainFunctionParser.NumAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullAtom(MainFunctionParser.NullAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAtom(MainFunctionParser.ThisAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(MainFunctionParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(MainFunctionParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MainFunctionParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAtom(MainFunctionParser.ListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAtom(MainFunctionParser.ObjectAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link MainFunctionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAtom(MainFunctionParser.LambdaAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextStringPart}
	 * labeled alternative in {@link MainFunctionParser#string_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStringPart(MainFunctionParser.TextStringPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EscapeStringPart}
	 * labeled alternative in {@link MainFunctionParser#string_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapeStringPart(MainFunctionParser.EscapeStringPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdInterpPart}
	 * labeled alternative in {@link MainFunctionParser#string_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdInterpPart(MainFunctionParser.IdInterpPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInterpPart}
	 * labeled alternative in {@link MainFunctionParser#string_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInterpPart(MainFunctionParser.ExprInterpPartContext ctx);
}