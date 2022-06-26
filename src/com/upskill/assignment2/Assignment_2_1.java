/*1.  Write a for loop that prints 50 through 1 separated by spaces in the same line. */

package com.upskill.assignment2;

 public class Assignment_2_1 {

	public static void main(String[] args) {
		practiceforLoop();
	}
		

public static void practiceforLoop(){         //For Loop - Do again and again upto upper limit
	int i;                                    //Initialize variables
	for(i=50; i>0; i--){                      //Setting Upper limit, Lower limit, Decrement
		System.out.print(" " + i );           //Statement
	}
}

}