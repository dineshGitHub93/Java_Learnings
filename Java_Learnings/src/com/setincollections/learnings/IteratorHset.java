package com.setincollections.learnings;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a HashSet
		HashSet<String> hset = new HashSet<String>();
		

		// Add an element in HashSet.
		hset.add("One");
		hset.add("Two");
		hset.add("Three");
		hset.add(null);
		hset.add("Four");
		hset.add("Five");

		//Display HashSet elements
		System.out.println("HashSet Content "+hset + "\n");
		
		Iterator<String> ite = hset.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("\nIterate the HashSet without Iterator \n");
		
		for(String temp:hset) {
			System.out.println(temp);
		}


	}

}
