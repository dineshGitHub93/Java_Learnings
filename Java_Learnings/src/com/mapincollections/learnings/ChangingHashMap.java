package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class ChangingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(new Integer(1), "One");
		map.put(new Integer(2), "Two");
		map.put(new Integer(3), "Three");
		map.put(new Integer(4), "Four");
		map.put(new Integer(5), "Five");
		
		for(Map.Entry<Integer, String> map1 : map.entrySet()) {
			
			System.out.println(map1.getKey() +"   "+map1.getValue());
		}
		
		map.put(3, "3");
		
		System.out.println("\n"+map); 

	}

}
