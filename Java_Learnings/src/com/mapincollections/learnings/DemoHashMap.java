package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashm = new HashMap<Integer, String>();
		
		hashm.put(0001, "Dinesh");
		hashm.put(new Integer(0002), "Vipin");
		hashm.put(new Integer(0003), "Akash");
		
		System.out.println(hashm);

			System.out.println("\n");
		//Traversing the map
		for(Map.Entry<Integer, String> me :hashm.entrySet()) {
			
			System.out.println( me.getKey()+" "+me.getValue());
		}
	}

}
