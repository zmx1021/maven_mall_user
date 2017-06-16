package com.atguigu.p2c.usermanage.mapper;

import java.util.List;

import com.atguigu.p2c.usermanage.bean.T_MALL_ADDRESS;
import com.atguigu.p2c.usermanage.bean.T_MALL_USER_ACCOUNT;

public interface AddressMapper {

	List<T_MALL_ADDRESS> select_address_by_user_id(T_MALL_USER_ACCOUNT user);
}
