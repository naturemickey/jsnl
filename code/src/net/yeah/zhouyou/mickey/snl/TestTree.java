package net.yeah.zhouyou.mickey.snl;

import net.yeah.zhouyou.mickey.snl.antlr4.SnlcLexer;
import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestTree {

    public static void main(String[] args) throws Exception {
        try (InputStream is = new FileInputStream("test_case/pass.snl")) {
            ANTLRInputStream input = new ANTLRInputStream(is);
            SnlcLexer lexer = new SnlcLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SnlcParser parser = new SnlcParser(tokens);
            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree(parser));
        }
    }

}
