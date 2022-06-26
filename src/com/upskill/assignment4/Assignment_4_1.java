package com.upskill.assignment4;
/* 1. Write a user program using encapsulation that contains the username, password, email, first and 
   last names of a user of our application. Display the user information in console output?*/
 
 class Encapsulate {

	private String username="JJ";
	private String password="PASSWORD";
	private String email="jafrin@gmail.com";
	private String firstname="Jafrin";
	private String lastname="Jahan";
	
	void display() {
		System.out.println("Username : " +username);
		System.out.println("Password : " +password);
		System.out.println("Email : " +email);
		System.out.println("Firstname : " +firstname);
		System.out.println("Lastname : " +lastname);
	}
 }
	public class Assignment_4_1 {
	
		public static void main(String[] args) {
		Encapsulate e = new Encapsulate();
		e.display();
	}
		

	}


