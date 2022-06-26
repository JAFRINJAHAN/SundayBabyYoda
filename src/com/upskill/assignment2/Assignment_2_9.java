/*9. Write a program to swap two string variables (Talen, Tech) and display result on the 
     screen. */

package com.upskill.assignment2;

public class Assignment_2_9 {

	public static void main(String[] args) {

String word1 = "Talen";
String word2 = "Tech";

String replaceString1 = word1.replace("Talen", "Tech");
String replaceString2 = word2.replace("Tech", "Talen");

System.out.println("Swap word 1 = " + replaceString1);
System.out.println("Swap word 2 = " + replaceString2);
}	

	
}
