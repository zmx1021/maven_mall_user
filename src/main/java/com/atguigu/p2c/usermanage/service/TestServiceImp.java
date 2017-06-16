package com.atguigu.p2c.usermanage.service;

import javax.jws.WebService;

@WebService
public class TestServiceImp implements TestServiceInf{

	@Override
	public String ping() {
		String result ="webService调用成功！";
		System.out.println("webService服务");
		return result;
	}

}
