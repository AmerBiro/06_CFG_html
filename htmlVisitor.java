// Generated from html.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link htmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface htmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link htmlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(htmlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(htmlParser.HtmlContext ctx);
}