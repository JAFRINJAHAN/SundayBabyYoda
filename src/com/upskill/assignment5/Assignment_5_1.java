package com.upskill.assignment5;

/* 1. Write a method that returns the largest integer in the list. 
  You can assume that the list has at least one element.*/
public class Assignment_5_1 {

	public static void main(String[] args) {
		int[] anArray = new int[] { 2, -1, 5, 8, 15, -15, 3 };

		int largest = anArray[0];

		for (int i = 0; i < anArray.length; i++) {
			if (anArray[i] > largest) {
				largest = anArray[i];
			}
		}
		System.out.println(largest);
	}
}
