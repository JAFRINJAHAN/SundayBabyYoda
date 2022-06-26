package com.upskill.assignment5;

import java.util.Scanner;

/* 3. A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
	Write a method that detects if a string is a palindrome.
	Tip: Use word.charAt(i) to get the character at position i. */

public class Assignment_5_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // To take input we use scanner class
												
		System.out.print("Enter a string : ");
		  
			String str = input.nextLine(); // To take String value we have to use nextLine
			String new_str = str;           // Declaring String variable
			String revstr = "";   // Declaring a String variable for reverse string
			
									
			for (int i = str.length() - 1; i >= 0; i--) {
				revstr = revstr + str.charAt(i); // This line is for making characters of each word
													
			}

			if(new_str.equals(revstr))
			{
				System.out.print(new_str + " is Palindrome String");
			}
			else
			{
			    System.out.print(new_str + " is Not Palindrome String");
		    }

	}

}
