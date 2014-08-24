// Generated from LibExpr.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LibExprParser}.
 */
public interface LibExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull LibExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull LibExprParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull LibExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull LibExprParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull LibExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull LibExprParser.StatContext ctx);
}