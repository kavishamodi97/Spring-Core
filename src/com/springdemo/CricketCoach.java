package com.springdemo;

public class CricketCoach implements Coach {

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("Inside Default Constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter Methods");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 20 mintues";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
