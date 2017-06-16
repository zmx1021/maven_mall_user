package com.atguigu.p2c.usermanage.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MypropertiesUtil {

	public static String getProperty(String key,String location) {

		Properties property = new Properties();

		InputStream resourceAsStream = MypropertiesUtil.class.getClassLoader()
				.getResourceAsStream(location);
		try {
			property.load(resourceAsStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return property.getProperty(key);

	}

}
