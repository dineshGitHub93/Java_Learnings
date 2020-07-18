package com.setincollections.learnings;

import java.util.HashSet;
import java.util.Iterator;

public class ConvertHashSet2Array {

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
				
				String[] array = hset.toArray(new String[hset.size()]);
				
				for(String temp:array) {
					System.out.println(temp);
				}
	}

}
