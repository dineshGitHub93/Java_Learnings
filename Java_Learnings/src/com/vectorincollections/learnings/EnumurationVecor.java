package com.vectorincollections.learnings;

import java.util.Enumeration;
import java.util.Vector;

public class EnumurationVecor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a vector
		Vector<String> vlist = new Vector<String>();
		
		// Add an element in vector
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		
		//Get Enumeration of vector elements
		Enumeration<String> e = vlist.elements();
		
		/* Display vector elements using hashMoreElements()*/
		
		System.out.println("Vector elements");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
