/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sqtds.antlr4.HelloLexer;
import org.sqtds.antlr4.HelloParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String str = null;
        while ((str=bufferedReader.readLine()) != null) {
            ANTLRInputStream input = new ANTLRInputStream(str);

            // create a lexer that feeds off of input CharStream
            HelloLexer lexer = new HelloLexer(input);

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            HelloParser parser = new HelloParser(tokens);

            ParseTree tree = parser.r();    // begin parsing at rule r
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        }

    }
}
