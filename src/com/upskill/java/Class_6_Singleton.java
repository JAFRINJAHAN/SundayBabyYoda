package com.upskill.java;

public class Class_6_Singleton {
	
	// Singleton is a class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating

	private Class_6_Singleton(){
		
	}
	
	// Private static object of the class
	private static Class_6_Singleton myObj = new Class_6_Singleton ();
	
	// Static instance method
	public static Class_6_Singleton getInstance(){
		return myObj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
}
