// Generated from PsiCoder.g by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsiCoderParser}.
 */
public interface PsiCoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PsiCoderParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PsiCoderParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracionesExternas}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionesExternas(PsiCoderParser.DeclaracionesExternasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracionesExternas}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionesExternas(PsiCoderParser.DeclaracionesExternasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#funcionN}.
	 * @param ctx the parse tree
	 */
	void enterFuncionN(PsiCoderParser.FuncionNContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#funcionN}.
	 * @param ctx the parse tree
	 */
	void exitFuncionN(PsiCoderParser.FuncionNContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#estructuraN}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraN(PsiCoderParser.EstructuraNContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#estructuraN}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraN(PsiCoderParser.EstructuraNContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(PsiCoderParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(PsiCoderParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(PsiCoderParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(PsiCoderParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracionesMultiples}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionesMultiples(PsiCoderParser.DeclaracionesMultiplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracionesMultiples}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionesMultiples(PsiCoderParser.DeclaracionesMultiplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracion2}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion2(PsiCoderParser.Declaracion2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracion2}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion2(PsiCoderParser.Declaracion2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracion2Aux}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion2Aux(PsiCoderParser.Declaracion2AuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracion2Aux}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion2Aux(PsiCoderParser.Declaracion2AuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#asignador}.
	 * @param ctx the parse tree
	 */
	void enterAsignador(PsiCoderParser.AsignadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#asignador}.
	 * @param ctx the parse tree
	 */
	void exitAsignador(PsiCoderParser.AsignadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PsiCoderParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PsiCoderParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#parametrosMultiples}.
	 * @param ctx the parse tree
	 */
	void enterParametrosMultiples(PsiCoderParser.ParametrosMultiplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#parametrosMultiples}.
	 * @param ctx the parse tree
	 */
	void exitParametrosMultiples(PsiCoderParser.ParametrosMultiplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PsiCoderParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PsiCoderParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#identificadorDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadorDeclaracion(PsiCoderParser.IdentificadorDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#identificadorDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadorDeclaracion(PsiCoderParser.IdentificadorDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(PsiCoderParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(PsiCoderParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#identificadorEstructura}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadorEstructura(PsiCoderParser.IdentificadorEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#identificadorEstructura}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadorEstructura(PsiCoderParser.IdentificadorEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#lexemaConcreto}.
	 * @param ctx the parse tree
	 */
	void enterLexemaConcreto(PsiCoderParser.LexemaConcretoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#lexemaConcreto}.
	 * @param ctx the parse tree
	 */
	void exitLexemaConcreto(PsiCoderParser.LexemaConcretoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpresionBooleana(PsiCoderParser.ExpresionBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpresionBooleana(PsiCoderParser.ExpresionBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionRelacional1}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional1(PsiCoderParser.ExpresionRelacional1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionRelacional1}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional1(PsiCoderParser.ExpresionRelacional1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional(PsiCoderParser.ExpresionRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional(PsiCoderParser.ExpresionRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionAritmetica1}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAritmetica1(PsiCoderParser.ExpresionAritmetica1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionAritmetica1}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAritmetica1(PsiCoderParser.ExpresionAritmetica1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAritmetica(PsiCoderParser.ExpresionAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAritmetica(PsiCoderParser.ExpresionAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(PsiCoderParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(PsiCoderParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresionBasica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionBasica(PsiCoderParser.ExpresionBasicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresionBasica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionBasica(PsiCoderParser.ExpresionBasicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarExpresionBasica}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarExpresionBasica(PsiCoderParser.AuxiliarExpresionBasicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarExpresionBasica}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarExpresionBasica(PsiCoderParser.AuxiliarExpresionBasicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarExpresionBasica2}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarExpresionBasica2(PsiCoderParser.AuxiliarExpresionBasica2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarExpresionBasica2}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarExpresionBasica2(PsiCoderParser.AuxiliarExpresionBasica2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(PsiCoderParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(PsiCoderParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(PsiCoderParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(PsiCoderParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarComando}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarComando(PsiCoderParser.AuxiliarComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarComando}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarComando(PsiCoderParser.AuxiliarComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarComando2}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarComando2(PsiCoderParser.AuxiliarComando2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarComando2}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarComando2(PsiCoderParser.AuxiliarComando2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#funcionEspecial}.
	 * @param ctx the parse tree
	 */
	void enterFuncionEspecial(PsiCoderParser.FuncionEspecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#funcionEspecial}.
	 * @param ctx the parse tree
	 */
	void exitFuncionEspecial(PsiCoderParser.FuncionEspecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PsiCoderParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PsiCoderParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#elseNonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterElseNonTerminal(PsiCoderParser.ElseNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#elseNonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitElseNonTerminal(PsiCoderParser.ElseNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(PsiCoderParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(PsiCoderParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#valoresImprimir}.
	 * @param ctx the parse tree
	 */
	void enterValoresImprimir(PsiCoderParser.ValoresImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#valoresImprimir}.
	 * @param ctx the parse tree
	 */
	void exitValoresImprimir(PsiCoderParser.ValoresImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#valoresMultiplesImprimir}.
	 * @param ctx the parse tree
	 */
	void enterValoresMultiplesImprimir(PsiCoderParser.ValoresMultiplesImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#valoresMultiplesImprimir}.
	 * @param ctx the parse tree
	 */
	void exitValoresMultiplesImprimir(PsiCoderParser.ValoresMultiplesImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#valoresMultiples}.
	 * @param ctx the parse tree
	 */
	void enterValoresMultiples(PsiCoderParser.ValoresMultiplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#valoresMultiples}.
	 * @param ctx the parse tree
	 */
	void exitValoresMultiples(PsiCoderParser.ValoresMultiplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloWhile(PsiCoderParser.CicloWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloWhile(PsiCoderParser.CicloWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#cicloDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloDoWhile(PsiCoderParser.CicloDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#cicloDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloDoWhile(PsiCoderParser.CicloDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#cicloPara}.
	 * @param ctx the parse tree
	 */
	void enterCicloPara(PsiCoderParser.CicloParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#cicloPara}.
	 * @param ctx the parse tree
	 */
	void exitCicloPara(PsiCoderParser.CicloParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#seleccionador}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionador(PsiCoderParser.SeleccionadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#seleccionador}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionador(PsiCoderParser.SeleccionadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#declaracionFor}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFor(PsiCoderParser.DeclaracionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#declaracionFor}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFor(PsiCoderParser.DeclaracionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarCasos}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarCasos(PsiCoderParser.AuxiliarCasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarCasos}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarCasos(PsiCoderParser.AuxiliarCasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarCasos2}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarCasos2(PsiCoderParser.AuxiliarCasos2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarCasos2}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarCasos2(PsiCoderParser.AuxiliarCasos2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#auxiliarCasos3}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliarCasos3(PsiCoderParser.AuxiliarCasos3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#auxiliarCasos3}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliarCasos3(PsiCoderParser.AuxiliarCasos3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#opcionalRomper}.
	 * @param ctx the parse tree
	 */
	void enterOpcionalRomper(PsiCoderParser.OpcionalRomperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#opcionalRomper}.
	 * @param ctx the parse tree
	 */
	void exitOpcionalRomper(PsiCoderParser.OpcionalRomperContext ctx);
}