// Generated from Calculator4.antlr by ANTLR 4.5.3

package calculator4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculator4Parser}.
 */
public interface Calculator4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculator4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calculator4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calculator4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator4Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Calculator4Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator4Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Calculator4Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDiv(Calculator4Parser.MultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOrDiv}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDiv(Calculator4Parser.MultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Calculator4Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Calculator4Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Calculator4Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Calculator4Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(Calculator4Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(Calculator4Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubtract(Calculator4Parser.AddOrSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOrSubtract}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubtract(Calculator4Parser.AddOrSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(Calculator4Parser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(Calculator4Parser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(Calculator4Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link Calculator4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(Calculator4Parser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator4Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(Calculator4Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator4Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(Calculator4Parser.ArgContext ctx);
}