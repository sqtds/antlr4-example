// Generated from org\sqtds\antlr4\spiltexpr\ActionExpr.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.action;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ActionExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ActionExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ActionExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ActionExprParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ActionExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ActionExprParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ActionExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull ActionExprParser.StatContext ctx);
}