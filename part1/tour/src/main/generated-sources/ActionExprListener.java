// Generated from ActionExpr.g4 by ANTLR 4.2.2

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActionExprParser}.
 */
public interface ActionExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActionExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ActionExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ActionExprParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ActionExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ActionExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ActionExprParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ActionExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull ActionExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull ActionExprParser.StatContext ctx);
}