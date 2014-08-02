package test;

public class Test {
    public void main(String[] args) {
        I i = a -> true;
    }

    static interface I {
        boolean test(Object object);
    }
}