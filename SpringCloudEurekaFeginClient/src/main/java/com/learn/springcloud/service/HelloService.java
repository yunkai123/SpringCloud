package com.learn.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Fegin服务声明
 * 调用远程服务
 * @author wanyunkai
 *
 */
@FeignClient(value="service-ribbon")
public interface HelloService {

	@RequestMapping(value="/feignhello", method=RequestMethod.GET)
	String sayHelloFromRibbon(@RequestParam(value="name") String name);
}
