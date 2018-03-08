package com.shsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.demo.HelloService;

public class test {

	public static void main(String[] args) {
		

		// 加载好配置文件夹
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-content.xml");
		
		HelloService hs =  (HelloService)act.getBean("helloService");
		
		hs.print();
		
		
		
	}
}
