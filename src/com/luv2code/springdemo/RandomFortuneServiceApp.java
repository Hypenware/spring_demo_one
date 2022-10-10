package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneServiceApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context_1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HappyFortuneService thefortuneservice = context_1.getBean("myFortuneService",HappyFortuneService.class);
		
		System.out.println(thefortuneservice.getFortuneService());
		
		context_1.close();

	}

}
