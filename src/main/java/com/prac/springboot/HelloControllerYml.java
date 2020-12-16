package com.prac.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试yml配置文件
 *
 */
@RestController
public class HelloControllerYml {
	// 获取yml文件中的name值
	@Value("${name}")
	private String name;
	// 获取yml文件中的url值
	@Value("${url}")
	private String url;
	@RequestMapping("/hello2")
	public String hello2() {
		return name+":"+url;
	}

}
