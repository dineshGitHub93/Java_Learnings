package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class IterateThroughMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		//inserting the elements
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "Three");
		
		for(Map.Entry<Integer, String> me : hm.entrySet()) {
			System.out.print(me.getKey() +" :");
			System.out.println(me.getValue());
		}

	}

}
