package com.luv2code.springdemo;

public class BadmintonCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Do court practice";
	}
}
