package com.upskill.java;
//Encapsulation used to hide the data using setter and getter method
public class Class_4_Encapsulation {

	private int ssn = 123456789; // Write only
	private String username = "user69"; // Read only
	private String name = "rasel"; // Write & Read only

	public void setSSN(int value) {    
		ssn = value;  //setter method

	}

	public String getUsername() {
		return username;  //getter method
	}

	public void setName(String value) {
		name = value;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Class_4_Encapsulation obj = new Class_4_Encapsulation();
		obj.setSSN(6666666);
		System.out.println("Username : " + obj.getUsername());
		obj.setName("Alam");
		System.out.println("Name : " + obj.getName());
	}

}
