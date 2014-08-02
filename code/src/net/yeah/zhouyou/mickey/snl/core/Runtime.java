package net.yeah.zhouyou.mickey.snl.core;

import java.util.ArrayDeque;
import java.util.Deque;

public class Runtime {

	public static class Stack {
		private static Deque<Object> stack = new ArrayDeque<>();
		private static Deque<Integer> pointStack = new ArrayDeque<>();

		public static void recordIdx() {
			pointStack.push(stack.size());
		}

		public static void clearIdx() {
			int i = pointStack.pop();
			while (--i > 0)
				stack.pop();
		}

		public static void push(Object obj) {
			stack.push(obj);
		}

		@SuppressWarnings("unchecked")
		public static <T> T peek() {
			return (T) stack.peek();
		}

		@SuppressWarnings("unchecked")
		public static <T> T pop() {
			return (T) stack.pop();
		}
	}

	private static Context currentContext = new Context();

	public static Context currentContext() {
		return currentContext;
	}

	public static void setCurrentContext(Context currentContext) {
		if (currentContext == null)
			throw new RuntimeException();
		Runtime.currentContext = currentContext;
	}

	public static void main(String[] args) {
		Stack.push(1);
		Stack.push(2);
		Stack.recordIdx();
		Stack.push(3);
		System.out.println(Stack.stack);
		Stack.clearIdx();
		System.out.println(Stack.stack);
	}
}
