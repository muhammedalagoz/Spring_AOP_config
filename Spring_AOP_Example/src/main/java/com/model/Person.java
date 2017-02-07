package com.model;

public interface Person {

	void addPerson();
	
	String addPersonReturnValue();
	
	void addPersonThrowException() throws Exception;
	
	void addPersonAround(String name);
}