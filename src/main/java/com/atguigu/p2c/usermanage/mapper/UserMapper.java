package com.atguigu.p2c.usermanage.mapper;

import com.atguigu.p2c.usermanage.bean.T_MALL_USER_ACCOUNT;

public interface UserMapper {
	
	T_MALL_USER_ACCOUNT select_user_by_account_pswd(T_MALL_USER_ACCOUNT t_MALL_USER_ACCOUNT);
	
	int insert_user_account(T_MALL_USER_ACCOUNT t_MALL_USER_ACCOUNT);

	T_MALL_USER_ACCOUNT select_user_by_account(String loginAccount);

}
