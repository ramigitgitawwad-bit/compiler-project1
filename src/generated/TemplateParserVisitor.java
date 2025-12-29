// Generated from grammar/TemplateParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(TemplateParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(TemplateParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(TemplateParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(TemplateParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(TemplateParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(TemplateParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(TemplateParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(TemplateParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TemplateParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TemplateParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(TemplateParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(TemplateParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TemplateParser.DeclarationContext ctx);
}