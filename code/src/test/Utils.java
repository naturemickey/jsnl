package test;

import net.yeah.zhouyou.mickey.snl.antlr4.SnlcLexer;
import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser;
import net.yeah.zhouyou.mickey.snl.core.Visitor;
import net.yeah.zhouyou.mickey.snl.core.util.ThreadLocalHelper;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {

	public static void test(String snlFile, String inputFile) {
		try {
			try (InputStream is = new FileInputStream(snlFile); InputStream in = new FileInputStream(inputFile)) {
				System.setIn(in);
				test(is);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void test(String snlFile) {
		try {
			try (InputStream is = new FileInputStream(snlFile)) {
				test(is);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test(InputStream is) throws IOException {
		SnlcLexer lexer = new SnlcLexer(new ANTLRInputStream(is));
		SnlcParser parser = new SnlcParser(new CommonTokenStream(lexer));

		ThreadLocalHelper.set(parser);

		ParseTree tree = parser.program();

		new Visitor().visit(tree);
	}

}
