package kotlintoc;
// Generated from C:/Moje/Notatki/5 semestr/Kompilatory/Translator/src/main/resources/simpleKotlin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleKotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleKotlinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(simpleKotlinParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(simpleKotlinParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#infile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile(simpleKotlinParser.InfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(simpleKotlinParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#funcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncall(simpleKotlinParser.FuncallContext ctx);
	/**
	 * Visit a parse tree produced by {link simpleKotlinParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(simpleKotlinParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(simpleKotlinParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(simpleKotlinParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#launchargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaunchargs(simpleKotlinParser.LaunchargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#launcharg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLauncharg(simpleKotlinParser.LaunchargContext ctx);
	/**
	 * Visit a parse tree produced by {link simpleKotlinParser#imppath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImppath(simpleKotlinParser.ImppathContext ctx);
	/**
	 * Visit a parse tree produced by {link simpleKotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(simpleKotlinParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(simpleKotlinParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(simpleKotlinParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {link simpleKotlinParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(simpleKotlinParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleKotlinParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(simpleKotlinParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {link simpleKotlinParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(simpleKotlinParser.BoolexprContext ctx);
}