package com.vectorincollections.learnings;

import java.util.Vector;

public class InitialCapcityOfVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vlist = new Vector<String>(5);
		
		System.out.println(" Default capacity of vector with initialize : "+vlist.capacity());
		
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		
		vlist.add("six");
		
		System.out.println(" Once met the default then capacity incremental is : "+vlist.capacity());
	}

}
