package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoIteratorHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(5, "Five");
		hmap.put(3, "Three");
		hmap.put(4, "Four");
		
		//Display the Content
		System.out.println(hmap);
		//Display the element by using for each loop
		for(Map.Entry me : hmap.entrySet()) {
			System.out.println("Key is : "+me.getKey() + " & Value is : "+me.getValue());
		}
		
		// While loop & Iterator
		System.out.println("\nHashMap Content \n");
		Iterator ite = hmap.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry me2 = (Map.Entry) ite.next();
			System.out.println("Key is : "+me2.getKey() + " Values is : "+me2.getValue());
		}
		

	}

}
