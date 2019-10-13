// Generated from simplelang.g4 by ANTLR 4.7.1
package mylanguage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplelangParser}.
 */
public interface simplelangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplelangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simplelangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplelangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simplelangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single}
	 * labeled alternative in {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSingle(simplelangParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSingle(simplelangParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSequence(simplelangParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link simplelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSequence(simplelangParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(simplelangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(simplelangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(simplelangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(simplelangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(simplelangParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(simplelangParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(simplelangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link simplelangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(simplelangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondition(simplelangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondition(simplelangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNot(simplelangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNot(simplelangParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOr(simplelangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOr(simplelangParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAnd(simplelangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link simplelangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAnd(simplelangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simplelangParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simplelangParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(simplelangParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(simplelangParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(simplelangParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(simplelangParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simplelangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simplelangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simplelangParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simplelangParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simplelangParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simplelangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simplelangParser.SignedConstantContext ctx);
}