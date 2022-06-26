package com.upskill.assignment5;

/* 2. Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number. */

public class Assignment_5_2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++)  
			if (i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else if (i%3==0){
				System.out.println("Fizz");
			}
			else if (i%5==0){
				System.out.println("Buzz");
			}
			else 
				System.out.println(i);

	}

}
