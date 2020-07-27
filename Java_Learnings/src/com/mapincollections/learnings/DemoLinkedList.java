package com.mapincollections.learnings;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> me = new LinkedHashMap<String, Integer>();
		
		me.put("One", 1);
		me.put("Two", 2);
		me.put("Three", 3);
		me.put("Four", 4);
		
		for(Map.Entry<String, Integer> e : me.entrySet()) {
			System.out.println(e.getKey() + " "+e.getValue());
		}

	}

}
