package com.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.service.DemoService;

/**
 * @Description: 服务提供者接口的实现
 * @author Andy
 * @date 2018年1月29日
 */
public class DemoServiceImpl implements DemoService{

	public List<String> getPermissions(Long id) {
		List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
	}
	
}
