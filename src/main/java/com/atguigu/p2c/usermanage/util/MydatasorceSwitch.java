package com.atguigu.p2c.usermanage.util;

public class MydatasorceSwitch {

	private static ThreadLocal<String> key = new ThreadLocal<>();

	public static String getKey() {
		return key.get();
	}

	public static void setKey(String key_in) {
		key.set(key_in);
	}
}
