package com.upskill.java;

public class Class_2_NestedIfElse {

	public static void main(String[] args) {
		
		int year = 2020;
		
		if (year<2000){
			System.out.println("20th Century");
		}
		else {
			if (year >=2019 && year <=2022){
				System.out.println("Pendemic");
			}
		else {
			System.out.println("21th Century");
		}
	}

	}
}
