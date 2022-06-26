package com.upskill.assignment3;

/*2.Write a java program which will display 5 employee information(name, age, salary and address).*/

public class Assignment_3_2 {

	static int count = 1;

	Assignment_3_2(String name, int age, int salary, String address) {
		System.out.println("Employee Number: " + count);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Age: " + age);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Address: " + address);
		count++;
		System.out.println("");
	}

	public static void main(String[] args) {
		Assignment_3_2[] obj = new Assignment_3_2[5];
		obj[0] = new Assignment_3_2("Jafrin", 26, 120000, "Jamaica");
		obj[1] = new Assignment_3_2("Nowrin", 21, 110000, "Astoria");
		obj[2] = new Assignment_3_2("Shreyan", 22, 100000, "Flushing");
		obj[3] = new Assignment_3_2("Sanjana", 25, 80000, "UK");
		obj[4] = new Assignment_3_2("Sarmin", 27, 75000, "BD");
		
	}

}
