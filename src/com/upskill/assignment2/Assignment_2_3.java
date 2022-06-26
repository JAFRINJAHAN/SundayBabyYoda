/*3. Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger 
     than other. (hints: using if..else) */

package com.upskill.assignment2;

public class Assignment_2_3 {

	public static void main(String[] args) {
		System.out.println("1st Return Value = " + functionA());
		System.out.println("2nd Return Value = " + functionB());
		maximumValue();
	}

	public static int functionA() {
		return 30;
	}

	public static int functionB() {
		return 50;
	}

	public static void maximumValue() {
		int number = 50;

		if (number <= 30) {
			System.out.println("This number is small");
		} else {
			System.out.println("This is big");
		}

	}
}
