package com.atguigu.p2c.usermanage.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;



public class MyCallbackService implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks)
			throws IOException, UnsupportedCallbackException {
		
		WSPasswordCallback wsPasswordCallback = (WSPasswordCallback) callbacks[0];
		
		String identifer = wsPasswordCallback.getIdentifier();
		
		String[] split = identifer.split("_");
		
		String invoker = split[0];//获取 invoker
		
		String timestrap = split[1];//获取客户端时间戳
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String format = sdf.format(new Date());
		
		BigDecimal bigDecimal = new BigDecimal(format);
		
		BigDecimal subtract = bigDecimal.subtract(new BigDecimal(timestrap));
		
		int compareTo = subtract.compareTo(new BigDecimal("10"));//有效时间为10秒
		
		if(compareTo<1){
			String password = MypropertiesUtil.getProperty(invoker,"webServiceSecurity.properties");
			
			String md5 = MD5Util.md5(password+timestrap);
			
			wsPasswordCallback.setPassword(md5);
		}
	}
}
