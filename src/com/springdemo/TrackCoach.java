package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
    public TrackCoach() {
		
	}

	public TrackCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:-" + fortuneService.getFortune() ;
	}
	
	public void doStartUpApp() {
		System.out.println("Inside Init Method");
	}
	
public void doCleanUpApp() {
	System.out.println("Inside Destroy Method");
	}

}
