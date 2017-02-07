package com.model.impl;

import com.model.Person;

public class PersonImpl implements Person {

	public void addPerson(){
		System.out.println("addPerson() is running ");
	}
	
	public String addPersonReturnValue(){
		System.out.println("addPersonReturnValue() is running ");
		return "abc";
	}
	
	public void addPersonThrowException() throws Exception {
		System.out.println("addPersonThrowException() is running ");
		throw new Exception("Error");
	}
	
	public void addPersonAround(String name){
		System.out.println("addPersonAround() is running, args : " + name);
	}
}