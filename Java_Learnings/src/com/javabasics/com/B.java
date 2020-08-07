package com.javabasics.com;
/*
 * A java program can contain any number of classes but utmost one class can be declared as public 
 * if there is public class then name of the program and name of class must be matched ,
 * otherwise we will get compile time error
 * 
 * if there is no public class then we can use any name to program name 
 * 
 */

class A {

}
public class B{
public static void main(String args[]) {
		System.out.println("Clas B");
	}
}
 class C{ //if the clas name is public ,then public type C must be defined in its own file
	public static void main(String args[]) {
		System.out.println("Clas C");
	}
	
	
}
