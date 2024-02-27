// Generated from /Users/kamil/bnfc-dart-example/lib/gen/arith/ArithParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithParser}.
 */
public interface ArithParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithParser#start_Exp2}.
	 * @param ctx the parse tree
	 */
	void enterStart_Exp2(ArithParser.Start_Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#start_Exp2}.
	 * @param ctx the parse tree
	 */
	void exitStart_Exp2(ArithParser.Start_Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#start_Exp1}.
	 * @param ctx the parse tree
	 */
	void enterStart_Exp1(ArithParser.Start_Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#start_Exp1}.
	 * @param ctx the parse tree
	 */
	void exitStart_Exp1(ArithParser.Start_Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#start_Exp}.
	 * @param ctx the parse tree
	 */
	void enterStart_Exp(ArithParser.Start_ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#start_Exp}.
	 * @param ctx the parse tree
	 */
	void exitStart_Exp(ArithParser.Start_ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ArithParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterConstInteger(ArithParser.ConstIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ArithParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitConstInteger(ArithParser.ConstIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDouble}
	 * labeled alternative in {@link ArithParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterConstDouble(ArithParser.ConstDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDouble}
	 * labeled alternative in {@link ArithParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitConstDouble(ArithParser.ConstDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ArithParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(ArithParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ArithParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(ArithParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ArithParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ArithParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link ArithParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ArithParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link ArithParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterMul(ArithParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link ArithParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitMul(ArithParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Coercion_Exp1_3}
	 * labeled alternative in {@link ArithParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterCoercion_Exp1_3(ArithParser.Coercion_Exp1_3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Coercion_Exp1_3}
	 * labeled alternative in {@link ArithParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitCoercion_Exp1_3(ArithParser.Coercion_Exp1_3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link ArithParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSub(ArithParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link ArithParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSub(ArithParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Coercion_Exp_3}
	 * labeled alternative in {@link ArithParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCoercion_Exp_3(ArithParser.Coercion_Exp_3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Coercion_Exp_3}
	 * labeled alternative in {@link ArithParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCoercion_Exp_3(ArithParser.Coercion_Exp_3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Sum}
	 * labeled alternative in {@link ArithParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSum(ArithParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sum}
	 * labeled alternative in {@link ArithParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSum(ArithParser.SumContext ctx);
}