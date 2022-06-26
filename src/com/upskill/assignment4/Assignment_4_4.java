package com.upskill.assignment4;
/* 4. Write a method to check leap year? */

/* Conditions to check whether any year is leap year or not : 
 * 1.Any year that is divisible by 400 is a leap year
 * 2.If divisible by 4 and not divisible by 100 , then that year is a leap year.
 */
public class Assignment_4_4 {

	public static void main(String[] args) {
		int year = 2024;
		if (year % 400 == 0) {
			System.out.println("Leap Year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}

}
