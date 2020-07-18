package com.setincollections.learnings;

import java.util.HashSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create HasHSet
		HashSet<String> hset  = new HashSet<String>();
		
		// Add an element in HashSet.
		hset.add("One");
		hset.add("Two");
		hset.add("Three");
		hset.add(null);
		hset.add("Four");
		hset.add("Five");
		
		//Display the elements which is available in HashSet
		System.out.println(hset);
		
		// Add an duplicate values in Vector
		hset.add("Three");
		
		//Add an null value
		hset.add(null);
		
		System.out.println(hset);
		
		

	}

}
