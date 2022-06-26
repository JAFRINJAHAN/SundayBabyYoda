/* 7.You are given two integer number (a=25, b=30), write a program to swap them and 
      display result on the screen. */  

package com.upskill.assignment2;

public class Assignment_2_7 {

	public static void main(String[] args) {
	swap();	

	}
public static void swap(){
	int a=25;
	int b=30;
	int switchvalue;
	
	switchvalue = a;
	a = b;
	b = switchvalue;
	
	System.out.println("Swap value a = " + a);
	System.out.println("Swap value b = " + b);
}
	
}
