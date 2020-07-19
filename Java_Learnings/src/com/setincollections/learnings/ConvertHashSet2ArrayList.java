package com.setincollections.learnings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertHashSet2ArrayList {

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
		
		List<String> list = new ArrayList<String>(hset);
		
		System.out.println(list);
	}

}
