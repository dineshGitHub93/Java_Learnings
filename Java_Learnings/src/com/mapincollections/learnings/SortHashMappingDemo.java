package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "One");
		hmap.put(5, "Five");
		hmap.put(10, "Ten");
		hmap.put(8, "Eight");
		hmap.put(9, "Nine");
		
		System.out.println(hmap+ "\n");
		
		System.out.println("Befor sort");
		Set set = hmap.entrySet();
		Iterator ite  =set.iterator();
		while(ite.hasNext()) {
			Map.Entry mentry = (Entry) ite.next();
			System.out.println("Key is : "+mentry.getKey() + " Value is : "+mentry.getValue());
		}
		
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		
		System.out.println("\nAfter sorting\n");
		Set set1 =map.entrySet();
		Iterator ite1 = set1.iterator();
		while(ite1.hasNext()) {
			Map.Entry me = (Entry) ite1.next();
			System.out.println(" Key is "+me.getKey() + " Values is "+me.getValue());
			
		}
		
		
		

	}

}
