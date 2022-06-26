package com.upskill.assignment4;

import java.util.Scanner;

/* 2. Write a method which will reverse a string ? */

public class Assignment_4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //To take input we use scanner class
		
		{
			String str;                          //Declaring String variable
			String revstr = "";                  //Declaring a String variable for reverse string
			
			System.out.print("Enter a string : ");
			str = input.nextLine();               // To take String value we have to use nextLine 

			for (int i = str.length() - 1; i >= 0; i--) {
				revstr = revstr + str.charAt(i);  //This line is for making characters of each word
			}
			
			System.out.print("The reverse string is : " + revstr);
		}

	}

}
