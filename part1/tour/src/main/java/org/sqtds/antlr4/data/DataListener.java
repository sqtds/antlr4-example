// Generated from org\sqtds\antlr4\data\Data.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.data;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataParser}.
 */
public interface DataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull DataParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull DataParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link DataParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull DataParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull DataParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link DataParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(@NotNull DataParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(@NotNull DataParser.GroupContext ctx);
}