package com.rock.dubbotest.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.rock.dubbotest.api.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	public String hello(String name) {
		System.out.println("HelloService接收到消息:"+name);
		return "hello " + name;
	}
}
