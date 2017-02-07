package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Aop-person.xml");

		Person person = (Person) appContext.getBean("person");
		person.addPerson();
		
		//person.addPersonReturnValue();
		
		//person.addPersonThrowException();
		
//		person.addPersonAround("muhammedAlagöz");

	}
}