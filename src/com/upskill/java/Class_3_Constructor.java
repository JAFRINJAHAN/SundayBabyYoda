package com.upskill.java;



/*Constructor is instance of class, method same as class name, java will execute constructor first
- 	Constructor cannot be static or override nor void or return type.
- 	Default Constructor : No constructor is initialized
- 	Parameterized Constructor
-	Constructor overloading
*/
	public class Class_3_Constructor {
		
	String admin;  //Initialize variable
	int adAge;     //Initialize variable
	String state;
	
	
	public Class_3_Constructor(String name , int age , String location){  //Create constructor of class, which execute first
		
		admin = name;   //Added value on variable
		adAge = age;    //Added value on variable
		state = location;
	}
	public static void main(String[] args) {
		
		Class_3_Constructor myobj = new Class_3_Constructor("Jafrin" , 25 , "NYC" ); //Creating object for specific instance
		
		System.out.println("Admin name ::: " + myobj.admin);
		System.out.println("Admin age ::: " + myobj.adAge);
		System.out.println("Admin location ::: " + myobj.state);
		
        Class_3_Constructor myobj2 = new Class_3_Constructor("Imtiaz" , 30 , "NJ" );  //Creating another object
		
		System.out.println("Admin name ::: " + myobj2.admin);
		System.out.println("Admin age ::: " + myobj2.adAge);
		System.out.println("Admin location ::: " + myobj2.state);
     
		Class_3_Constructor myobj3 = new Class_3_Constructor("Azad" , 28, "VT");  //Creating another object
		
	    System.out.println("Admin name ::: " + myobj3.admin);
		System.out.println("Admin age ::: " + myobj3.adAge);
		System.out.println("Admin location ::: " + myobj3.state);
	
	
	}
	}


/*public class Class_3_Constructor {
	int number;
	
	Class_3_Constructor(int number){
		number = 11 ;
	}
	
 
public static void main(String args[]) {
	Class_3_Constructor myobj = new Class_3_Constructor(11);
	System.out.println(" number : " + myobj.number );
}
}*/
	