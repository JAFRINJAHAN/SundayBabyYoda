package com.upskill.java;

public class Class_2_Loops extends Class_1_MethodType_Object{

	/* Type of Loops
	 1. For Loop
	 2. While Loop
	 3. Do While Loop
	 4. Infinite Loop */
	 
	public static void main(String[] args) {
	
		//practiceforLoop();
       // practicewhileLoop();
      // practiceDoWhile();
        practiceInfinite();
       // practiceNestedForLoop();
		//multipicationTable();
	}
/*public static void practiceforLoop(){         //For Loop - Do again and again upto upper limit
	int i;                                    //Initialize variables
	for(i=50; i>0; i--){                      //Setting Lower limit, Upper limit, Increment or Decrement
		System.out.print(" " + i );           //Statement
	}
}
	

/*public static void practicewhileLoop(){    //While Loop - Do again and again upto condition match
		int i = 1;                             //Initialize variables
		while(i<20){                          //Setting Condition
			System.out.println("While Loops Numbers = " + i); //Statement
			i++;                                             //Increment or Decrement
			}
		}
	
public static void practiceDoWhile(){       //Do While Loop - Do action and then match condition
	int i = 1;                              //Initialize variables
	do {
		System.out.println("Do-While Loops Numbers = " + i);  //Statement
	i++;                                                     //Increment
	}                                                      
	while (i<=20);                                         //Checking Condition
}*/
	
	public static void practiceInfinite(){
		int i;
		for(i=1;    ; i++){          //Setting no lower limits
			System.out.println("Infinite Loops Numbers = " + i);
		}
	}}
	
/*	public static void practiceNestedForLoop(){       //Nested loop = loop inside another loop
		int i;                                        //Initializing variable i
		int j;                                        //Initializing variable j
		for(i=1; i<10; i++){                          //First loop for i
			for(j=1; j<10; j++){                      //Second loop for j
				System.out.println("Nested For Loops Numbers = " + i + ":" + j);  //Statement for j loop	
			}
			System.out.println("Increase value of i -> " + i);       
		}
	}
	
	public static void multipicationTable() {
		
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
		}*/

