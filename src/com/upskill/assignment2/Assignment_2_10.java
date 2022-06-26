/* 10. Write a Java program to convert temperature from Fahrenheit to Celsius degree. */ 

package com.upskill.assignment2;

public class Assignment_2_10 {

	public static void main(String[] args) {
	
		float Fahrenheit, Celsius;
		Fahrenheit = 98;
		Celsius = ((Fahrenheit-32)*5)/9;
		
		System.out.println("Temperature in Celsius is : " + Celsius); 

		/*float Celsius, Fahrenheit;
		Celsius = 33;
		Fahrenheit = Celsius * (9/5) + 32;
		
		System.out.println("Temperature in Fahrenheit is : " + Fahrenheit); */
	}

}
