package kotlintoc;
// Generated from C:/Moje/Notatki/5 semestr/Kompilatory/Translator/src/main/resources/simpleKotlin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleKotlinParser}.
 */
public interface simpleKotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(simpleKotlinParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(simpleKotlinParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(simpleKotlinParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(simpleKotlinParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#infile}.
	 * @param ctx the parse tree
	 */
	void enterInfile(simpleKotlinParser.InfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#infile}.
	 * @param ctx the parse tree
	 */
	void exitInfile(simpleKotlinParser.InfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(simpleKotlinParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(simpleKotlinParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(simpleKotlinParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(simpleKotlinParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by {link simpleKotlinParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(simpleKotlinParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {link simpleKotlinParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(simpleKotlinParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(simpleKotlinParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(simpleKotlinParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(simpleKotlinParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(simpleKotlinParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#launchargs}.
	 * @param ctx the parse tree
	 */
	void enterLaunchargs(simpleKotlinParser.LaunchargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#launchargs}.
	 * @param ctx the parse tree
	 */
	void exitLaunchargs(simpleKotlinParser.LaunchargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#launcharg}.
	 * @param ctx the parse tree
	 */
	void enterLauncharg(simpleKotlinParser.LaunchargContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#launcharg}.
	 * @param ctx the parse tree
	 */
	void exitLauncharg(simpleKotlinParser.LaunchargContext ctx);
	/**
	 * Enter a parse tree produced by {link simpleKotlinParser#imppath}.
	 * @param ctx the parse tree
	 */
	void enterImppath(simpleKotlinParser.ImppathContext ctx);
	/**
	 * Exit a parse tree produced by {link simpleKotlinParser#imppath}.
	 * @param ctx the parse tree
	 */
	void exitImppath(simpleKotlinParser.ImppathContext ctx);
	/**
	 * Enter a parse tree produced by {link simpleKotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(simpleKotlinParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {link simpleKotlinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(simpleKotlinParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(simpleKotlinParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(simpleKotlinParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(simpleKotlinParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(simpleKotlinParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {link simpleKotlinParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(simpleKotlinParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {link simpleKotlinParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(simpleKotlinParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleKotlinParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(simpleKotlinParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleKotlinParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(simpleKotlinParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {link simpleKotlinParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(simpleKotlinParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {link simpleKotlinParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(simpleKotlinParser.BoolexprContext ctx);
}