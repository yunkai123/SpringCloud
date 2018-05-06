package com.learn.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springcloud.service.HelloService;

@RestController
public class TestController {

	@Autowired
	private HelloService helloService;
	
	/**
	 * 通过feign远程调用另一个项目的服务
	 * @param name
	 * @return
	 */
	@RequestMapping("hello")
	public String hello(String name) {
		return helloService.sayHelloFromRibbon(name);
	}
	
	/**
	 * 本地服务，可以被远程调用
	 * @param name
	 * @return
	 */
	@RequestMapping("ribbonhello")
	public String sayHello(String name) {
		return "hello " + name + " this is fegin spring cloud";
	}
}
