package com.dubbo.service.impl;

import com.dubbo.service.UserService;

/**
 * @Description: 服务提供者接口的实现
 * @author Andy
 * @date 2018年1月29日
 */
public class UserServiceImpl implements UserService{

	public String getName(String userId) {
		return "Andy"+userId;
	}
}
