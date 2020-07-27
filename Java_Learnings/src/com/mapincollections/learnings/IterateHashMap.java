package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> me = new HashMap<Integer, String>();
		
		me.put(1, "One");
		me.put(2, "Two");
		me.put(3, "Three");
		me.put(4, "Four");
		
		for(Map.Entry element : me.entrySet()) {
			
			int key = (int) element.getKey();
			String value = (String) element.getValue();
			
			System.out.println(key +" "+value);
		}

	}

}
