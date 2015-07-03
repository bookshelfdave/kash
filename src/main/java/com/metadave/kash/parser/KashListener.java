// Generated from ./src/main/java/com/metadave/kash/parser/Kash.g4 by ANTLR 4.5
package com.metadave.kash.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KashParser}.
 */
public interface KashListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KashParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(KashParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(KashParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#connect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConnect_stmt(KashParser.Connect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#connect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConnect_stmt(KashParser.Connect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#hostport}.
	 * @param ctx the parse tree
	 */
	void enterHostport(KashParser.HostportContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#hostport}.
	 * @param ctx the parse tree
	 */
	void exitHostport(KashParser.HostportContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#create_topic}.
	 * @param ctx the parse tree
	 */
	void enterCreate_topic(KashParser.Create_topicContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#create_topic}.
	 * @param ctx the parse tree
	 */
	void exitCreate_topic(KashParser.Create_topicContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#describe_topic}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_topic(KashParser.Describe_topicContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#describe_topic}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_topic(KashParser.Describe_topicContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#keyvalues}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalues(KashParser.KeyvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#keyvalues}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalues(KashParser.KeyvaluesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(KashParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(KashParser.KeyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void enterValuetype(KashParser.ValuetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#valuetype}.
	 * @param ctx the parse tree
	 */
	void exitValuetype(KashParser.ValuetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KashParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(KashParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KashParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(KashParser.String_valueContext ctx);
}