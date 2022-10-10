package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService ;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService ;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get fortune
		return fortuneService.getFortune();
	}
	//add init method
	public void domystartuostuff() {
	System.out.println("TrackCoach: inside method domystartupstuff");

	}
	//add destroy method
	public void domycleanupstuffYOYO() {
	System.out.println("TrackCoach: inside method domycleanupstuffYOYO");
	}
	
}
