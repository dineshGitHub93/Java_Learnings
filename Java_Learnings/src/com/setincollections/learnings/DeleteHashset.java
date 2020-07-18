package com.setincollections.learnings;

import java.util.HashSet;

public class DeleteHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a HashSet
		HashSet<String> hset= new HashSet<String>();

		// Add an element in HashSet.
		hset.add("One");
		hset.add("Two");
		hset.add("Three");
		hset.add(null);
		hset.add("Four");
		hset.add("Five");
		
		//Display HashSet elements
		System.out.println("HashSet Content "+hset);
		
		//Delete the elements which is available in HashSet
		hset.removeAll(hset);
		
		// Print elements of hset
		
		System.out.println(hset);
		
		
		System.out.println("To check whether the Hset is empty : "+hset.isEmpty()); 
		
		
		
		
		

	}

}
