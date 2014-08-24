// Generated from org\sqtds\antlr4\labexpr\LabeledExpr.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.labexpr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull LabeledExprParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull LabeledExprParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull LabeledExprParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(@NotNull LabeledExprParser.PrintExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#blank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(@NotNull LabeledExprParser.BlankContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull LabeledExprParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull LabeledExprParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull LabeledExprParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull LabeledExprParser.MulDivContext ctx);
}