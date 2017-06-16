package com.atguigu.p2c.usermanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.p2c.usermanage.bean.T_MALL_ADDRESS;
import com.atguigu.p2c.usermanage.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.p2c.usermanage.mapper.AddressMapper;
import com.atguigu.p2c.usermanage.util.MydatasorceSwitch;

public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressMapper addressMapper;

	@Override
	public List<T_MALL_ADDRESS> query_address_by_user_id(
			T_MALL_USER_ACCOUNT user) {
		//使用user数据源
		MydatasorceSwitch.setKey("user");
		
		List<T_MALL_ADDRESS> list_address = addressMapper.select_address_by_user_id(user);
		return list_address;
	}
 
}
