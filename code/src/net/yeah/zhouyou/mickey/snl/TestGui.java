package net.yeah.zhouyou.mickey.snl;


import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.misc.TestRig;

public class TestGui {

	public static void main(String[] args) throws Exception {
		try (InputStream in = new FileInputStream("test_case/pass.snl")) {
			System.setIn(in);

			TestRig grun = new TestRig(new String[] { "net.yeah.zhouyou.mickey.snl.antlr4.Snlc", "program", "-gui" });
			grun.process();
		}
	}

}
