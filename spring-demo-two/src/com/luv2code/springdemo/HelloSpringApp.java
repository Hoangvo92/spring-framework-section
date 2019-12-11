package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach thatCoach = context.getBean("otherCoach", Coach.class);//
		Coach exCoach = context.getBean("extraCoach", Coach.class);// practice Activity #1
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(thatCoach.getDailyWorkout());//
		System.out.println(exCoach.getDailyWorkout());// practice Activity #1
		//close the context
		context.close();

	}

}
