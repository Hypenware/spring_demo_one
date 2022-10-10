package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService ;
	
	//add new fields for email address and name
	private String emailaddress ;
	private String team ;
	
	//create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no args Constructor");
	}
	
	//create setter method for email and name
	public void setEmailaddress(String emailaddress) {
		System.out.println("CricketCoach :inside setter method- Email address");
		this.emailaddress = emailaddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach :inside setter method- team");
		this.team = team;
	}
	
	
	public String getEmailaddress() {
		return emailaddress;
	}

	public String getTeam() {
		return team;
	}

	//create setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach :inside setter method- fortuneService");
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for half an hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
