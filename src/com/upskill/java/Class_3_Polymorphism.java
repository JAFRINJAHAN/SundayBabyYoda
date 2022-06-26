package com.upskill.java;
/* Polymorphism is the ability of an object to take on many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
/* This is an example of Method Overloading*/
public class Class_3_Polymorphism {

	public static void main(String[] args) {
	car("nice","red" );	

	}
public static void car(){
	System.out.println("My car is Audi");
}
public static void car(int door){
	System.out.println("My car is Audi, it has door : " + door);
}
public static void car(String color){
	System.out.println("My car is Audi, its color : " + color);
}
public static void car(int door , String color){
	System.out.println("My car is Audi, it has door : " + door + " ; its color : " + color);
}
public static void car(int engine , int wheel){
	System.out.println("My Car is Audi, it has engine : " + engine + " ; its wheel : " + wheel);
}
public static void car(String color, int door){
	System.out.println("My car is Audi, it's color : " + color + " ; it has door : " + door);
}
public static void car(String door , String color){
	System.out.println("My car is Audi, it has door : " + door + " ; its color : " + color);
}


}