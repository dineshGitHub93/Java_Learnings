package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		hmap.put(4, "Four");
		hmap.put(5, "Five");
		hmap.put(6, "Six");
		
		System.out.println(hmap);
		
		//Display the Content using Iterator
		Set set = hmap.entrySet(); 
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
		Map.Entry mentry = (Map.Entry)iterator.next();
        System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
        System.out.println(mentry.getValue());
     }
		

	}

}
