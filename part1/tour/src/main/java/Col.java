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
import org.sqtds.antlr4.row.RowsLexer;
import org.sqtds.antlr4.row.RowsParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Col {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String str = null;
        while ((str=bufferedReader.readLine()) != null) {
            InputStream is = new FileInputStream(str);
            ANTLRInputStream input = new ANTLRInputStream(is);
            RowsLexer lexer = new RowsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            int i = 1;// 2,3
            RowsParser parser = new RowsParser(tokens, i); // pass column number!
            parser.setBuildParseTree(false); // don't waste time bulding a tree
            parser.file(); // parse

        }

    }
}
