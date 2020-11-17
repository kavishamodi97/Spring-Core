package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String args[]) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve beans from spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods
		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		System.out.println(coach.getEmailAddress());

		System.out.println(coach.getTeam());

		// close context
		context.close();

	}
}
