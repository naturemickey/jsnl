package net.yeah.zhouyou.mickey.snl.core.type;

public abstract class BasicType implements IType {

    public abstract Object construct(String input);

    public static class Int extends BasicType {
        @Override
        public Object construct(String input) {
            if (input == null)
                return null;
            return Integer.valueOf(input);
        }
    }

    public static class Char extends BasicType {
        @Override
        public Object construct(String input) {
            char[] cs = input.toCharArray();
            if (cs.length == 1)
                return (int) cs[0];
            if (cs.length == 3 && cs[0] == '\'' && cs[2] == '\'')
                return (int) cs[1];
            throw new RuntimeException();
        }
    }

}
