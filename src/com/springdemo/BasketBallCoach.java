package com.springdemo;

public class BasketBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do 40 Minutes Catching practice";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
