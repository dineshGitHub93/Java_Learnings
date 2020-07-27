package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(new Integer(1001), "One");
		map.put(new Integer(1003), "Three");
		map.put(new Integer(1002), "Two");
		
		for(Map.Entry<Integer, String> hm : map.entrySet()) {
			
			System.out.println(hm.getKey() + " " +hm.getValue());
		}
		
		map.remove(1003);
		
		System.out.println("\n"+map);

	}

}
