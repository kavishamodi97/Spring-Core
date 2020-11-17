package com.springdemo;

public class HappyFortuneServices implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Lucky Day!!";
	}
}
