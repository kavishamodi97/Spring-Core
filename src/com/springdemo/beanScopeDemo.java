package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean isObjSame = (theCoach == alphaCoach);

		System.out.println("Printing same Object:- " + isObjSame);
		System.out.println("Printing object 1 Memory Location:- " + theCoach);
		System.out.println("Printing object 2 Memory Location:- " + alphaCoach);

		context.close();

	}
}
