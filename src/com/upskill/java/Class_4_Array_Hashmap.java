package com.upskill.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Class_4_Array_Hashmap {

	public static void main(String[] args) {
		// Array store multiple value using index
		int age = 30;

		int[] ageYoda = new int[] { 30, 24, 28, 32, 55, 48 };

		             // Array Index [0] [1] [2] [3] [4] [5]

		System.out.println("Variable Value " + age);

		System.out.println("Array Value " + ageYoda[4]);

		System.out.println("Array length " + ageYoda.length);

		// Write an array called nameYoda

		String name = "Rishi";

		String[] nameYoda = new String[] { "Jafrin", "Rishi", "Imtiaz", "Ravinder" };

		System.out.println("Variable Value " + name);
		System.out.println("Array Value " + nameYoda[2]);
		System.out.println("Array length " + nameYoda.length);

		// Multi-dimentional Array

		int[][] ageYoda2D = { { 30, 24, 28, 32, 55 }, // [0][0] [0][1] [0][2]  [0][3] [0][4]
														 
				              { 95, 49, 11 } }; // [1][0] [1][1] [1][2]

		System.out.println("2D Array Value " + ageYoda2D[1][1]);

		// Multi-dimentional Print Array

		for (int i = 0; i < ageYoda2D.length; i++) {
			for (int j = 0; j < ageYoda2D[i].length; j++) {
				System.out.print(ageYoda2D[i][j] + " ");
			}
		}
		System.out.println(" ");

		// Single dimentional Print Array
		for (int i = 0; i < ageYoda.length; i++) {
			System.out.print(ageYoda[i] + " ");
		}
		// HashMap store multiple data using name , age

		System.out.println(" ");

		HashMap<String, Integer> Student = new HashMap<String, Integer>();

		Student.put("Azad", 30);
		Student.put("Aastha", 21);
		Student.put("Kazi", 27);
		Student.put("Imtiaz", 30);
		Student.put("Rishi", 31);
		Student.put("Jafrin", 28);

		System.out.println("HashMap Value, Student Age " + Student.get("Azad"));

		// HashMap using Country, Capital
		System.out.println(" ");

		HashMap<String, String> Country = new HashMap<String, String>();
		Country.put("Bangladesh", "Dhaka");
		Country.put("USA", "Washington");
		Country.put("India", "Delhi");

		System.out.println("HashMap Value, Country Capital " + Country.get("India"));
		System.out.println("HashMap Size: " + Country.size());   //To find the length we use .size()

		// HashSet store unordered collection containing unique value,
		// Implementation of Set Interface
		System.out.println(" ");

		HashSet<String> Car = new HashSet<String>();

		Car.add("BMW");
		Car.add("AUDI");
		Car.add("FORD");

		System.out.println("HashSet Value: " + Car);
		System.out.println("HashSet Size: " + Car.size());

		//Hashtable
		Hashtable<String, String> employee = new Hashtable<String, String>();
		employee.put("Jafrin", "NYC");
		employee.put("Aastha", "NJ");
		employee.put("Imtiaz", "CT");

		System.out.println("Hashtable Value, Employee's City " + employee.get("Jafrin"));
		System.out.println("Hashtable Size: " + employee.size()); 
	}
}



