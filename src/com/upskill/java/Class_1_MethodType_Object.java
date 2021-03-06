

package com.upskill.java;

//Test Git

public class Class_1_MethodType_Object {
	
	static int hourlyIncome = 65; //Manual QA = 40-55$, Automation QA = 50-70$, SDET = 60-80$

	public static void main(String[] args) {
		
		//Static Method - can call directly
		weeklyIncomeVoid();
		
		//Void non-static Method - have to create class object and call it
		Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();
		myobj.annualIncomeVoid();
		int monthly = myobj.monthlyIncomeReturn();
		System.out.println("Monthly Income ::: " + monthly);
		
	}
	
/* 	Types of Methods
  	1.Void Method
   	2.Static Method
   	3.Return Type Method   */
	
	
	//Void non-static Method
	public void annualIncomeVoid(){
		int annual = hourlyIncome * 2000;
		System.out.println("Annual Income ::: " + annual);
	}
	
	//Static Method
	public static void weeklyIncomeVoid(){
		int weekly = hourlyIncome * 40;
		System.out.println("Weekly Income ::: " + weekly);
	}

	//Return Type Method - non-static
	public int monthlyIncomeReturn(){
		int monthly = hourlyIncome * 180;
		return monthly;
	}
	
	//Return Type Method - static
	public static int monthlyIncomeReturn2(){
		int monthly = hourlyIncome * 180;
		return monthly;
	}

	
}
