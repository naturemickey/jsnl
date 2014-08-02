package net.yeah.zhouyou.mickey.snl.core.util;

public class ThreadLocalHelper {

	private static ThreadLocal<Object> holder = new ThreadLocal<>();

	public static void set(Object o) {
		holder.set(o);
	}

	@SuppressWarnings("unchecked")
	public static <T> T get() {
		return (T) holder.get();
	}

}
