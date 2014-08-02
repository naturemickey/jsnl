// Generated from D:\IdeaProjects\jsnl\src\net\yeah\zhouyou\mickey\snl\antlr4\Snlc.g4 by ANTLR 4.x
package net.yeah.zhouyou.mickey.snl.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SnlcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SnlcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SnlcParser#procDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDeclare(@NotNull SnlcParser.ProcDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#declarePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarePart(@NotNull SnlcParser.DeclarePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#fieldDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecList(@NotNull SnlcParser.FieldDecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull SnlcParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#typeDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecList(@NotNull SnlcParser.TypeDecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull SnlcParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#programBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBody(@NotNull SnlcParser.ProgramBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#stmList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmList(@NotNull SnlcParser.StmListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull SnlcParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull SnlcParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#outputStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStm(@NotNull SnlcParser.OutputStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#inputStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStm(@NotNull SnlcParser.InputStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#loopStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStm(@NotNull SnlcParser.LoopStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#typeDecpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecpart(@NotNull SnlcParser.TypeDecpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#varDecpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecpart(@NotNull SnlcParser.VarDecpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#variMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariMore(@NotNull SnlcParser.VariMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(@NotNull SnlcParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(@NotNull SnlcParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#structureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureType(@NotNull SnlcParser.StructureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#varDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecList(@NotNull SnlcParser.VarDecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm(@NotNull SnlcParser.StmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull SnlcParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#actParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActParamList(@NotNull SnlcParser.ActParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull SnlcParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SnlcParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#procDecpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDecpart(@NotNull SnlcParser.ProcDecpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#callStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStm(@NotNull SnlcParser.CallStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#condExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExp(@NotNull SnlcParser.CondExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SnlcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#conditionalStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStm(@NotNull SnlcParser.ConditionalStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(@NotNull SnlcParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull SnlcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnlcParser#programHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHead(@NotNull SnlcParser.ProgramHeadContext ctx);
}