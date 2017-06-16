package com.atguigu.p2c.usermanage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.p2c.usermanage.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.p2c.usermanage.mapper.UserMapper;
import com.atguigu.p2c.usermanage.util.MydatasorceSwitch;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public T_MALL_USER_ACCOUNT query_user_login(
			T_MALL_USER_ACCOUNT t_MALL_USER_ACCOUNT) {
		// 数据源切换
		MydatasorceSwitch.setKey("user");
		return userMapper.select_user_by_account_pswd(t_MALL_USER_ACCOUNT);
	}

	@Override
	public int insert_user_regist(T_MALL_USER_ACCOUNT t_MALL_USER_ACCOUNT) {
		// 数据源切换
		MydatasorceSwitch.setKey("user");
		return userMapper.insert_user_account(t_MALL_USER_ACCOUNT);
	}

	@Override
	public T_MALL_USER_ACCOUNT query_user_by_username(
			String loginAccount) {
		//数据源切换
		MydatasorceSwitch.setKey("user");
		return userMapper.select_user_by_account(loginAccount);
	}

}
