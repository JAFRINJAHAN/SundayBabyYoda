/* 8. Write Java Program to display Factorial of Number 7. */

package com.upskill.assignment2;

public class Assignment_2_8 {

	public static void main(String[] args) {
		displayfactorialNumber();
	}
	public static void displayfactorialNumber(){
	int i;
	int fact = 1;
	
	for(i=1; i<=7; i++){
		fact = fact*i;
	}
		System.out.println("Factorial of 7 = " + fact);
	}

	}


