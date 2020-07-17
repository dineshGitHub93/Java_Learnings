package com.vectorincollections.learnings;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vlist = new Vector<String>();
		
		System.out.println(" Default capacity of vector is : "+vlist.capacity());
		
		vlist.add("one");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		vlist.add("Six");
		vlist.add("Seven");
		vlist.add("Eight");
		vlist.add("Nine");
		vlist.add("Ten");
		
		vlist.add("Eleven");
		System.out.println(" After resized when the 11th element added "+vlist.capacity());
		
		
		
		

	}

}
