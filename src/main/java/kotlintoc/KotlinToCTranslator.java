package kotlintoc;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class KotlinToCTranslator {

    public static void main(String[] args) throws Exception {
        System.out.println("Write your code below: ");
        // Create an input stream from the file.
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        // Create a lexer for the Kotlin language.
        simpleKotlinLexer lexer = new simpleKotlinLexer(input);

        // Create a token stream from the lexer.
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser for the Kotlin language.
        simpleKotlinParser parser = new simpleKotlinParser(tokens);

        // Parse the input.
        ParseTree tree = parser.prog();

        // Translate the tree to C code.
        SimpleKotlinCConversionListener listener = new SimpleKotlinCConversionListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        // Print the C code.
        System.out.println(listener.getCCode());
    }
}