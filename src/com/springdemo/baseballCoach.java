package com.springdemo;

public class baseballCoach implements Coach {

	private FortuneService theFortuneService;

	public baseballCoach(FortuneService fortuneService) {
		theFortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mintues on Batting Pratice";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}
}
