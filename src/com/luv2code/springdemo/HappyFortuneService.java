package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	//initializing fortune services
	private String fortuneService_1;
	private String fortuneService_2;
	private String fortuneService_3;
	
	public HappyFortuneService() {
		System.out.println(" Inside no args Constructor");
	}


	//public HappyFortuneService(String fortuneService_1, String fortuneService_2, String fortuneService_3) {
		//super();
		//this.fortuneService_1 = fortuneService_1;
		//this.fortuneService_2 = fortuneService_2;
		//this.fortuneService_3 = fortuneService_3;	
	//}
	
	
	
	
	
	public void setFortuneService_1(String fortuneService_1) {
		this.fortuneService_1 = fortuneService_1;
	}

	public void setFortuneService_2(String fortuneService_2) {
		this.fortuneService_2 = fortuneService_2;
	}

	public void setFortuneService_3(String fortuneService_3) {
		this.fortuneService_3 = fortuneService_3;
	}

	String[] Array = {fortuneService_1,fortuneService_2,fortuneService_3} ;
	
	
	public String getFortuneService() {
		Random generator = new Random();
		int randomIndex = generator.nextInt(Array.length);
		return Array[randomIndex];
	}

	@Override
	public String getFortune() {
		
		return "abc";
	}

}
