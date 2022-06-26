/*6.  Write a java program to find the prime number from 1 to 100 and print them.*/

package com.upskill.assignment2;

public class Assignment_2_6 {

	public static void main(String[] args) {
		primeNumber();

	}
public static void primeNumber(){
	int upperbound = 100;
	for (int i = 2; i <= 100; ++i){
		
		int maxFactor = (int) Math.sqrt(i);
		boolean isPrime = true;
		int factor = 2;
		while (isPrime && factor <= maxFactor) {
			if (i % factor == 0) {
				isPrime = false;
			}
		++factor;
		}
	if (isPrime)
		System.out.println(i + " is a prime");
	}
}
	
}
