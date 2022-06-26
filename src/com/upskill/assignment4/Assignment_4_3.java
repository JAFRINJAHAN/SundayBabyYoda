package com.upskill.assignment4;
/* 3. Write a method which return count of duplicate value from a array? */

public class Assignment_4_3 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 2, 5, 6, 6, 7, 8, 9, 9 };
		System.out.print("Duplicate elements in Array : ");

		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.print(" " + array[j]);
			}
		}

	}

}
