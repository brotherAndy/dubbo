package com.dubbo.service;

import java.util.List;

/**
 * @Description: 给服务提供者和消费者公用的接口
 * @author Andy
 * @date 2018年1月29日
 */
public interface DemoService {
	
	List<String> getPermissions(Long id);
}
