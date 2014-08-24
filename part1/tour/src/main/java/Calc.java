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
import org.sqtds.antlr4.labexpr.LabeledExprLexer;
import org.sqtds.antlr4.labexpr.LabeledExprParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String str = null;
        while ((str=bufferedReader.readLine()) != null) {
            if (str.endsWith("expr")) {
                InputStream is = new FileInputStream(str);
                ANTLRInputStream input = new ANTLRInputStream(is);
                LabeledExprLexer lexer = new LabeledExprLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                LabeledExprParser parser = new LabeledExprParser(tokens);
                ParseTree tree = parser.prog(); // parse

                EvalVisitor eval = new EvalVisitor();
                eval.visit(tree);
            }
        }

    }
}
