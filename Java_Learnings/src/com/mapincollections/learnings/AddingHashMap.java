package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class AddingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashm = new HashMap<Integer, String>();
		
		//Adding element in HashMap
		hashm.put(1001, "Apple");
		hashm.put(1002, "Mango");
		hashm.put(1003, "Orange");
		hashm.put(1004, "Banana");
		
		for(Map.Entry<Integer, String> me : hashm.entrySet()) {
			
			System.out.println(me.getKey()+"  "+me.getValue());
			
		}
		
		System.out.println("\n");
		
		hashm.put(new Integer(2001), "Java");
		hashm.put(new Integer(2002), "Java Script");
		hashm.put(new Integer(2003), "NodeJs");
		
		for(Map.Entry<Integer, String> me1 : hashm.entrySet()) {
			
			System.out.println(me1.getKey()+"  "+me1.getValue());
		}
		

	}

}
