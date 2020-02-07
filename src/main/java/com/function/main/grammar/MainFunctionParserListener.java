// Generated from C:/Code/minecraft/modding/mcfunction_lambdas/src/main/antlr\MainFunctionParser.g4 by ANTLR 4.8
package com.function.main.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainFunctionParser}.
 */
public interface MainFunctionParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link MainFunctionParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(MainFunctionParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(MainFunctionParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(MainFunctionParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(MainFunctionParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#line}.
     *
     * @param ctx the parse tree
     */
    void enterLine(MainFunctionParser.LineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#line}.
     *
     * @param ctx the parse tree
     */
    void exitLine(MainFunctionParser.LineContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#assert_line}.
     *
     * @param ctx the parse tree
     */
    void enterAssert_line(MainFunctionParser.Assert_lineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#assert_line}.
     *
     * @param ctx the parse tree
     */
    void exitAssert_line(MainFunctionParser.Assert_lineContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#ending_line}.
     *
     * @param ctx the parse tree
     */
    void enterEnding_line(MainFunctionParser.Ending_lineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#ending_line}.
     *
     * @param ctx the parse tree
     */
    void exitEnding_line(MainFunctionParser.Ending_lineContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#function_class}.
     *
     * @param ctx the parse tree
     */
    void enterFunction_class(MainFunctionParser.Function_classContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#function_class}.
     *
     * @param ctx the parse tree
     */
    void exitFunction_class(MainFunctionParser.Function_classContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#gen_mcfunction_line}.
     *
     * @param ctx the parse tree
     */
    void enterGen_mcfunction_line(MainFunctionParser.Gen_mcfunction_lineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#gen_mcfunction_line}.
     *
     * @param ctx the parse tree
     */
    void exitGen_mcfunction_line(MainFunctionParser.Gen_mcfunction_lineContext ctx);

    /**
     * Enter a parse tree produced by the {@code FunctionClassLine}
     * labeled alternative in {@link MainFunctionParser#class_line}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionClassLine(MainFunctionParser.FunctionClassLineContext ctx);

    /**
     * Exit a parse tree produced by the {@code FunctionClassLine}
     * labeled alternative in {@link MainFunctionParser#class_line}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionClassLine(MainFunctionParser.FunctionClassLineContext ctx);

    /**
     * Enter a parse tree produced by the {@code ConstructorClassLine}
     * labeled alternative in {@link MainFunctionParser#class_line}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorClassLine(MainFunctionParser.ConstructorClassLineContext ctx);

    /**
     * Exit a parse tree produced by the {@code ConstructorClassLine}
     * labeled alternative in {@link MainFunctionParser#class_line}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorClassLine(MainFunctionParser.ConstructorClassLineContext ctx);

    /**
     * Enter a parse tree produced by the {@code ConstantLine}
     * labeled alternative in {@link MainFunctionParser#class_line}.
     *
     * @param ctx the parse tree
     */
    void enterConstantLine(MainFunctionParser.ConstantLineContext ctx);

    /**
     * Exit a parse tree produced by the {@code ConstantLine}
     * labeled alternative in {@link MainFunctionParser#class_line}.
     *
     * @param ctx the parse tree
     */
    void exitConstantLine(MainFunctionParser.ConstantLineContext ctx);

    /**
     * Enter a parse tree produced by the {@code VarDeclarationMod}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclarationMod(MainFunctionParser.VarDeclarationModContext ctx);

    /**
     * Exit a parse tree produced by the {@code VarDeclarationMod}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclarationMod(MainFunctionParser.VarDeclarationModContext ctx);

    /**
     * Enter a parse tree produced by the {@code VarDeclarationModPlusPlus}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclarationModPlusPlus(MainFunctionParser.VarDeclarationModPlusPlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code VarDeclarationModPlusPlus}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclarationModPlusPlus(MainFunctionParser.VarDeclarationModPlusPlusContext ctx);

    /**
     * Enter a parse tree produced by the {@code VarDeclarationListItem}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclarationListItem(MainFunctionParser.VarDeclarationListItemContext ctx);

    /**
     * Exit a parse tree produced by the {@code VarDeclarationListItem}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclarationListItem(MainFunctionParser.VarDeclarationListItemContext ctx);

    /**
     * Enter a parse tree produced by the {@code VarDeclarationListItemPlusPlus}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclarationListItemPlusPlus(MainFunctionParser.VarDeclarationListItemPlusPlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code VarDeclarationListItemPlusPlus}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclarationListItemPlusPlus(MainFunctionParser.VarDeclarationListItemPlusPlusContext ctx);

    /**
     * Enter a parse tree produced by the {@code VarDeclarationObjectItem}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclarationObjectItem(MainFunctionParser.VarDeclarationObjectItemContext ctx);

    /**
     * Exit a parse tree produced by the {@code VarDeclarationObjectItem}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclarationObjectItem(MainFunctionParser.VarDeclarationObjectItemContext ctx);

    /**
     * Enter a parse tree produced by the {@code VarDeclarationObjectItemPlusPlus}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclarationObjectItemPlusPlus(MainFunctionParser.VarDeclarationObjectItemPlusPlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code VarDeclarationObjectItemPlusPlus}
     * labeled alternative in {@link MainFunctionParser#var_modification}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclarationObjectItemPlusPlus(MainFunctionParser.VarDeclarationObjectItemPlusPlusContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#var_definition}.
     *
     * @param ctx the parse tree
     */
    void enterVar_definition(MainFunctionParser.Var_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#var_definition}.
     *
     * @param ctx the parse tree
     */
    void exitVar_definition(MainFunctionParser.Var_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#if_statement}.
     *
     * @param ctx the parse tree
     */
    void enterIf_statement(MainFunctionParser.If_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#if_statement}.
     *
     * @param ctx the parse tree
     */
    void exitIf_statement(MainFunctionParser.If_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#expr_block}.
     *
     * @param ctx the parse tree
     */
    void enterExpr_block(MainFunctionParser.Expr_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#expr_block}.
     *
     * @param ctx the parse tree
     */
    void exitExpr_block(MainFunctionParser.Expr_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#stat_block}.
     *
     * @param ctx the parse tree
     */
    void enterStat_block(MainFunctionParser.Stat_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#stat_block}.
     *
     * @param ctx the parse tree
     */
    void exitStat_block(MainFunctionParser.Stat_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(MainFunctionParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(MainFunctionParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#for_loop}.
     *
     * @param ctx the parse tree
     */
    void enterFor_loop(MainFunctionParser.For_loopContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#for_loop}.
     *
     * @param ctx the parse tree
     */
    void exitFor_loop(MainFunctionParser.For_loopContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#foreach_loop}.
     *
     * @param ctx the parse tree
     */
    void enterForeach_loop(MainFunctionParser.Foreach_loopContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#foreach_loop}.
     *
     * @param ctx the parse tree
     */
    void exitForeach_loop(MainFunctionParser.Foreach_loopContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#while_loop}.
     *
     * @param ctx the parse tree
     */
    void enterWhile_loop(MainFunctionParser.While_loopContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#while_loop}.
     *
     * @param ctx the parse tree
     */
    void exitWhile_loop(MainFunctionParser.While_loopContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#do_while_loop}.
     *
     * @param ctx the parse tree
     */
    void enterDo_while_loop(MainFunctionParser.Do_while_loopContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#do_while_loop}.
     *
     * @param ctx the parse tree
     */
    void exitDo_while_loop(MainFunctionParser.Do_while_loopContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#log_line}.
     *
     * @param ctx the parse tree
     */
    void enterLog_line(MainFunctionParser.Log_lineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#log_line}.
     *
     * @param ctx the parse tree
     */
    void exitLog_line(MainFunctionParser.Log_lineContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#function_call_line}.
     *
     * @param ctx the parse tree
     */
    void enterFunction_call_line(MainFunctionParser.Function_call_lineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#function_call_line}.
     *
     * @param ctx the parse tree
     */
    void exitFunction_call_line(MainFunctionParser.Function_call_lineContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#function_line}.
     *
     * @param ctx the parse tree
     */
    void enterFunction_line(MainFunctionParser.Function_lineContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#function_line}.
     *
     * @param ctx the parse tree
     */
    void exitFunction_line(MainFunctionParser.Function_lineContext ctx);

    /**
     * Enter a parse tree produced by {@link MainFunctionParser#command}.
     *
     * @param ctx the parse tree
     */
    void enterCommand(MainFunctionParser.CommandContext ctx);

    /**
     * Exit a parse tree produced by {@link MainFunctionParser#command}.
     *
     * @param ctx the parse tree
     */
    void exitCommand(MainFunctionParser.CommandContext ctx);

    /**
     * Enter a parse tree produced by the {@code CommandText}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void enterCommandText(MainFunctionParser.CommandTextContext ctx);

    /**
     * Exit a parse tree produced by the {@code CommandText}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void exitCommandText(MainFunctionParser.CommandTextContext ctx);

    /**
     * Enter a parse tree produced by the {@code CommandIdInterpPart}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void enterCommandIdInterpPart(MainFunctionParser.CommandIdInterpPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code CommandIdInterpPart}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void exitCommandIdInterpPart(MainFunctionParser.CommandIdInterpPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code CommandExprInterpPart}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void enterCommandExprInterpPart(MainFunctionParser.CommandExprInterpPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code CommandExprInterpPart}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void exitCommandExprInterpPart(MainFunctionParser.CommandExprInterpPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code CommmandGoOnPart}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void enterCommmandGoOnPart(MainFunctionParser.CommmandGoOnPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code CommmandGoOnPart}
     * labeled alternative in {@link MainFunctionParser#command_part}.
     *
     * @param ctx the parse tree
     */
    void exitCommmandGoOnPart(MainFunctionParser.CommmandGoOnPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code negationExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterNegationExpr(MainFunctionParser.NegationExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code negationExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitNegationExpr(MainFunctionParser.NegationExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code getFromObjectExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterGetFromObjectExpr(MainFunctionParser.GetFromObjectExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code getFromObjectExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitGetFromObjectExpr(MainFunctionParser.GetFromObjectExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAtomExpr(MainFunctionParser.AtomExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAtomExpr(MainFunctionParser.AtomExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code orExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterOrExpr(MainFunctionParser.OrExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code orExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitOrExpr(MainFunctionParser.OrExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code additiveExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAdditiveExpr(MainFunctionParser.AdditiveExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code additiveExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAdditiveExpr(MainFunctionParser.AdditiveExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code relationalExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterRelationalExpr(MainFunctionParser.RelationalExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code relationalExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitRelationalExpr(MainFunctionParser.RelationalExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code subExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterSubExpr(MainFunctionParser.SubExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code subExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitSubExpr(MainFunctionParser.SubExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code elvisExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterElvisExpr(MainFunctionParser.ElvisExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code elvisExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitElvisExpr(MainFunctionParser.ElvisExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code parExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterParExpr(MainFunctionParser.ParExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code parExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitParExpr(MainFunctionParser.ParExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code notExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterNotExpr(MainFunctionParser.NotExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code notExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitNotExpr(MainFunctionParser.NotExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code ternaryExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterTernaryExpr(MainFunctionParser.TernaryExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code ternaryExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitTernaryExpr(MainFunctionParser.TernaryExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code runFunctionExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterRunFunctionExpr(MainFunctionParser.RunFunctionExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code runFunctionExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitRunFunctionExpr(MainFunctionParser.RunFunctionExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code multiplicationExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMultiplicationExpr(MainFunctionParser.MultiplicationExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code multiplicationExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMultiplicationExpr(MainFunctionParser.MultiplicationExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code powExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterPowExpr(MainFunctionParser.PowExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code powExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitPowExpr(MainFunctionParser.PowExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code isExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterIsExpr(MainFunctionParser.IsExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code isExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitIsExpr(MainFunctionParser.IsExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code getItemExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterGetItemExpr(MainFunctionParser.GetItemExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code getItemExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitGetItemExpr(MainFunctionParser.GetItemExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code equalityExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterEqualityExpr(MainFunctionParser.EqualityExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code equalityExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitEqualityExpr(MainFunctionParser.EqualityExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code andExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAndExpr(MainFunctionParser.AndExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code andExpr}
     * labeled alternative in {@link MainFunctionParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAndExpr(MainFunctionParser.AndExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code numAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterNumAtom(MainFunctionParser.NumAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code numAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitNumAtom(MainFunctionParser.NumAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code nullAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterNullAtom(MainFunctionParser.NullAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code nullAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitNullAtom(MainFunctionParser.NullAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code thisAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterThisAtom(MainFunctionParser.ThisAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code thisAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitThisAtom(MainFunctionParser.ThisAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code booleanAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanAtom(MainFunctionParser.BooleanAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code booleanAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanAtom(MainFunctionParser.BooleanAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifierAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierAtom(MainFunctionParser.IdentifierAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifierAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierAtom(MainFunctionParser.IdentifierAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code stringAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterStringAtom(MainFunctionParser.StringAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code stringAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitStringAtom(MainFunctionParser.StringAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code listAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterListAtom(MainFunctionParser.ListAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code listAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitListAtom(MainFunctionParser.ListAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code objectAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterObjectAtom(MainFunctionParser.ObjectAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code objectAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitObjectAtom(MainFunctionParser.ObjectAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code lambdaAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaAtom(MainFunctionParser.LambdaAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code lambdaAtom}
     * labeled alternative in {@link MainFunctionParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitLambdaAtom(MainFunctionParser.LambdaAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code TextStringPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void enterTextStringPart(MainFunctionParser.TextStringPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code TextStringPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void exitTextStringPart(MainFunctionParser.TextStringPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code EscapeStringPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void enterEscapeStringPart(MainFunctionParser.EscapeStringPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code EscapeStringPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void exitEscapeStringPart(MainFunctionParser.EscapeStringPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code IdInterpPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void enterIdInterpPart(MainFunctionParser.IdInterpPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code IdInterpPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void exitIdInterpPart(MainFunctionParser.IdInterpPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code ExprInterpPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void enterExprInterpPart(MainFunctionParser.ExprInterpPartContext ctx);

    /**
     * Exit a parse tree produced by the {@code ExprInterpPart}
     * labeled alternative in {@link MainFunctionParser#string_part}.
     *
     * @param ctx the parse tree
     */
    void exitExprInterpPart(MainFunctionParser.ExprInterpPartContext ctx);

    /**
     * Enter a parse tree produced by the {@code RangeExpressionNoInc}
     * labeled alternative in {@link MainFunctionParser#range_expr}.
     *
     * @param ctx the parse tree
     */
    void enterRangeExpressionNoInc(MainFunctionParser.RangeExpressionNoIncContext ctx);

    /**
     * Exit a parse tree produced by the {@code RangeExpressionNoInc}
     * labeled alternative in {@link MainFunctionParser#range_expr}.
     *
     * @param ctx the parse tree
     */
    void exitRangeExpressionNoInc(MainFunctionParser.RangeExpressionNoIncContext ctx);

    /**
     * Enter a parse tree produced by the {@code RangeExpressionInc}
     * labeled alternative in {@link MainFunctionParser#range_expr}.
     *
     * @param ctx the parse tree
     */
    void enterRangeExpressionInc(MainFunctionParser.RangeExpressionIncContext ctx);

    /**
     * Exit a parse tree produced by the {@code RangeExpressionInc}
     * labeled alternative in {@link MainFunctionParser#range_expr}.
     *
     * @param ctx the parse tree
     */
    void exitRangeExpressionInc(MainFunctionParser.RangeExpressionIncContext ctx);
}