package com.learn.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate template;
	
	//远程调用另外一个项目的接口
	@RequestMapping("hello")
	public String ribbon(String name) {
		return template.getForObject("http://service-hi/ribbonhello?name=" + name, String.class);
	}
	
	//要被远程调用的接口
	@RequestMapping("feignhello")
	public String hello(String name) {
		return "hello " + name + " this is ribbon spring cloud";
	}
}
