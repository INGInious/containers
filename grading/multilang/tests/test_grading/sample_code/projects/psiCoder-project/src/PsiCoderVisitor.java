// Generated from PsiCoder.g by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsiCoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsiCoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PsiCoderParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaracionesExternas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesExternas(PsiCoderParser.DeclaracionesExternasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#funcionN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionN(PsiCoderParser.FuncionNContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#estructuraN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraN(PsiCoderParser.EstructuraNContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(PsiCoderParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(PsiCoderParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaracionesMultiples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesMultiples(PsiCoderParser.DeclaracionesMultiplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaracion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion2(PsiCoderParser.Declaracion2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaracion2Aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion2Aux(PsiCoderParser.Declaracion2AuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#asignador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignador(PsiCoderParser.AsignadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(PsiCoderParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#parametrosMultiples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosMultiples(PsiCoderParser.ParametrosMultiplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PsiCoderParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#identificadorDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificadorDeclaracion(PsiCoderParser.IdentificadorDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(PsiCoderParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#identificadorEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificadorEstructura(PsiCoderParser.IdentificadorEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#lexemaConcreto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexemaConcreto(PsiCoderParser.LexemaConcretoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionBooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionBooleana(PsiCoderParser.ExpresionBooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionRelacional1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional1(PsiCoderParser.ExpresionRelacional1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional(PsiCoderParser.ExpresionRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionAritmetica1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionAritmetica1(PsiCoderParser.ExpresionAritmetica1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionAritmetica(PsiCoderParser.ExpresionAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(PsiCoderParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresionBasica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionBasica(PsiCoderParser.ExpresionBasicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarExpresionBasica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarExpresionBasica(PsiCoderParser.AuxiliarExpresionBasicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarExpresionBasica2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarExpresionBasica2(PsiCoderParser.AuxiliarExpresionBasica2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(PsiCoderParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(PsiCoderParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarComando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarComando(PsiCoderParser.AuxiliarComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarComando2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarComando2(PsiCoderParser.AuxiliarComando2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#funcionEspecial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionEspecial(PsiCoderParser.FuncionEspecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(PsiCoderParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#elseNonTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseNonTerminal(PsiCoderParser.ElseNonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(PsiCoderParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#valoresImprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoresImprimir(PsiCoderParser.ValoresImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#valoresMultiplesImprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoresMultiplesImprimir(PsiCoderParser.ValoresMultiplesImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#valoresMultiples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoresMultiples(PsiCoderParser.ValoresMultiplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#cicloWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(PsiCoderParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#cicloDoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloDoWhile(PsiCoderParser.CicloDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#cicloPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloPara(PsiCoderParser.CicloParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#seleccionador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionador(PsiCoderParser.SeleccionadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#declaracionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFor(PsiCoderParser.DeclaracionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarCasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarCasos(PsiCoderParser.AuxiliarCasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarCasos2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarCasos2(PsiCoderParser.AuxiliarCasos2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#auxiliarCasos3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliarCasos3(PsiCoderParser.AuxiliarCasos3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#opcionalRomper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcionalRomper(PsiCoderParser.OpcionalRomperContext ctx);
}