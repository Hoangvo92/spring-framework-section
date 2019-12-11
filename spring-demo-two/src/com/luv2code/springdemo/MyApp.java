package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the object
		
		//Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		Coach secondCoach = new TennisCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(secondCoach.getDailyWorkout());

	}

}
