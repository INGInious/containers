// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v1.g4 by ANTLR 4.6
package lex.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QB64v1Parser}.
 */
public interface QB64v1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#qb}.
	 * @param ctx the parse tree
	 */
	void enterQb(QB64v1Parser.QbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#qb}.
	 * @param ctx the parse tree
	 */
	void exitQb(QB64v1Parser.QbContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(QB64v1Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(QB64v1Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(QB64v1Parser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(QB64v1Parser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(QB64v1Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(QB64v1Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QB64v1Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QB64v1Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QB64v1Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QB64v1Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#print_list}.
	 * @param ctx the parse tree
	 */
	void enterPrint_list(QB64v1Parser.Print_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#print_list}.
	 * @param ctx the parse tree
	 */
	void exitPrint_list(QB64v1Parser.Print_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(QB64v1Parser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(QB64v1Parser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(QB64v1Parser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(QB64v1Parser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(QB64v1Parser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(QB64v1Parser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#do_until}.
	 * @param ctx the parse tree
	 */
	void enterDo_until(QB64v1Parser.Do_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#do_until}.
	 * @param ctx the parse tree
	 */
	void exitDo_until(QB64v1Parser.Do_untilContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(QB64v1Parser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(QB64v1Parser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#select_}.
	 * @param ctx the parse tree
	 */
	void enterSelect_(QB64v1Parser.Select_Context ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#select_}.
	 * @param ctx the parse tree
	 */
	void exitSelect_(QB64v1Parser.Select_Context ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#cases_list}.
	 * @param ctx the parse tree
	 */
	void enterCases_list(QB64v1Parser.Cases_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#cases_list}.
	 * @param ctx the parse tree
	 */
	void exitCases_list(QB64v1Parser.Cases_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QB64v1Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QB64v1Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(QB64v1Parser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(QB64v1Parser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration(QB64v1Parser.Const_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration(QB64v1Parser.Const_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#const_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration_list(QB64v1Parser.Const_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#const_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration_list(QB64v1Parser.Const_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QB64v1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QB64v1Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSingle_numeric_assignment(QB64v1Parser.Single_numeric_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSingle_numeric_assignment(QB64v1Parser.Single_numeric_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_numeric_assignment(QB64v1Parser.Array_numeric_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_numeric_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_numeric_assignment(QB64v1Parser.Array_numeric_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QB64v1Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QB64v1Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id(QB64v1Parser.Single_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id(QB64v1Parser.Single_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_numeric_id(QB64v1Parser.Single_numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_numeric_id(QB64v1Parser.Single_numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(QB64v1Parser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(QB64v1Parser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_numeric_id(QB64v1Parser.Array_numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_numeric_id(QB64v1Parser.Array_numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_id_int}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_int(QB64v1Parser.Array_id_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_id_int}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_int(QB64v1Parser.Array_id_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_id_long}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_long(QB64v1Parser.Array_id_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_id_long}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_long(QB64v1Parser.Array_id_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_id_single}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_single(QB64v1Parser.Array_id_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_id_single}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_single(QB64v1Parser.Array_id_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_id_double}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_double(QB64v1Parser.Array_id_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_id_double}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_double(QB64v1Parser.Array_id_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array_id_string}.
	 * @param ctx the parse tree
	 */
	void enterArray_id_string(QB64v1Parser.Array_id_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array_id_string}.
	 * @param ctx the parse tree
	 */
	void exitArray_id_string(QB64v1Parser.Array_id_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_id_int}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_int(QB64v1Parser.Single_id_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_id_int}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_int(QB64v1Parser.Single_id_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_id_long}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_long(QB64v1Parser.Single_id_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_id_long}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_long(QB64v1Parser.Single_id_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_id_single}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_single(QB64v1Parser.Single_id_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_id_single}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_single(QB64v1Parser.Single_id_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_id_double}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_double(QB64v1Parser.Single_id_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_id_double}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_double(QB64v1Parser.Single_id_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#single_id_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id_string(QB64v1Parser.Single_id_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#single_id_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id_string(QB64v1Parser.Single_id_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QB64v1Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QB64v1Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(QB64v1Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(QB64v1Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QB64v1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QB64v1Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QB64v1Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QB64v1Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_value(QB64v1Parser.Numeric_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_value(QB64v1Parser.Numeric_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(QB64v1Parser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(QB64v1Parser.String_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QB64v1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QB64v1Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void enterFunproc(QB64v1Parser.FunprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#funproc}.
	 * @param ctx the parse tree
	 */
	void exitFunproc(QB64v1Parser.FunprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#call_sub}.
	 * @param ctx the parse tree
	 */
	void enterCall_sub(QB64v1Parser.Call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#call_sub}.
	 * @param ctx the parse tree
	 */
	void exitCall_sub(QB64v1Parser.Call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(QB64v1Parser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(QB64v1Parser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(QB64v1Parser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(QB64v1Parser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#negop}.
	 * @param ctx the parse tree
	 */
	void enterNegop(QB64v1Parser.NegopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#negop}.
	 * @param ctx the parse tree
	 */
	void exitNegop(QB64v1Parser.NegopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(QB64v1Parser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(QB64v1Parser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(QB64v1Parser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(QB64v1Parser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QB64v1Parser#proop}.
	 * @param ctx the parse tree
	 */
	void enterProop(QB64v1Parser.ProopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QB64v1Parser#proop}.
	 * @param ctx the parse tree
	 */
	void exitProop(QB64v1Parser.ProopContext ctx);
}