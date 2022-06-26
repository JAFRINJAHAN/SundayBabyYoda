package com.upskill.assignment4;

/* 1. Write a user program using encapsulation that contains the username, password, email, first and 
last names of a user of our application. Display the user information in console output?*/
public class Assignment_4_1_1 {

	private String username = "JJ";
	private int password = 123456;
	private String email = "jafrin@gmail.com";
	private String firstname = "Jafrin";
	private String lastname = "Jahan";

	public String getUsername() {
		return username; // getter method(Read only)
	}

	public void setPassword(int value) {
		password = value; // setter method(Write only)

	}

	public String getEmail() {
		return email;
	}

	public void setFirstname(String value) {
		firstname = value;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setLastname(String value) {
		lastname = value;
	}

	public String getLastname() {
		return lastname;
	}

	public static void main(String[] args) {
		Assignment_4_1_1 myObj = new Assignment_4_1_1();

		System.out.println("Username : " + myObj.getUsername());
		myObj.setPassword(112233);
		System.out.println("Email : " + myObj.getEmail());

		myObj.setFirstname("Nowrin");
		System.out.println("Firstname : " + myObj.getFirstname());

		myObj.setLastname("Eshan");
		System.out.println("Lastname : " + myObj.getLastname());
	}

}
