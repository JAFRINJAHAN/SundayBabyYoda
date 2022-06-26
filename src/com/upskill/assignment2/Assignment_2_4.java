/* 4.  Write a for loop upto 500 which will increase the value double every time.*/

package com.upskill.assignment2;

public class Assignment_2_4 {

	public static void main(String[] args) {
		practiceforLoop();
	}
    public static void practiceforLoop(){
	int i;
	for (i=1; i<=500; i=i*2){    //Setting Lower limit, Upper limit, Increment 
		
		System.out.println("Double Values :" +i);           //Statement
	}
	
}

}