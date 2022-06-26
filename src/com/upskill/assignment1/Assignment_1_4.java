package com.upskill.assignment1;
//A function returns 30, another function returns 50.//
//Write a java program which will display subtraction value from bigger number to smaller.//


public class Assignment_1_4 {

	public static void main(String[] args) {
	System.out.println("1st Return Value = "+ functionA());
	System.out.println("2nd Return Value = "+ functionB());
	substractionValue();
	}
	public static int functionA(){
		return 30;	
	}
	public static int functionB(){
		return 50;
	}
	public static void substractionValue(){
	int functionA = 30;
	int functionB = 50;
	int substractionValue = functionB - functionA;
	
	System.out.println("3rd Return Value = " + substractionValue );
	
	}	
		
}

/*public static void maximumValue(){
	   int functionA = 30;
	   int functionB = 50;
		
		System.out.println(Math.max(functionA,functionB));*/
		
