package com.setincollections.learnings;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSet2TreeSet {

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
		
		// Convert HashSet 2 TreeSet
		Set<String> convert = new TreeSet<String>(hset);
		
		System.out.println("TreeSet Contains : "+convert);
		
		

	}

}
