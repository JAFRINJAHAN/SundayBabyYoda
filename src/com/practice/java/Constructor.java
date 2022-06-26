package com.practice.java;


	public class Constructor {
		String admin;
		int years;
		int earnings;
		String location;

			public Constructor (String name, int age, int salary, String address){
				admin = name;
				years = age;
				earnings = salary;
				location = address;	
			}
			
			public static void main(String[] args) {
				Constructor myobj = new Constructor( "Jafrin" , 26 , 50000 , "NYC" );
				System.out.println("Admin name ::: " + myobj.admin);
				System.out.println("Admin age ::: " + myobj.years);
				System.out.println("Admin salary ::: " + myobj.earnings);
				System.out.println("Admin address ::: " + myobj.location);
					
			}
			
		
	}


