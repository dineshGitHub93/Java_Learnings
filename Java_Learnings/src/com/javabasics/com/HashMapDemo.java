package com.javabasics.com;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(100));
		hm.put("c", new Integer(100));
		hm.put("d", new Integer(100));
		hm.put("f", new Integer(100));
		
		//Traversing through the mapping 
		for (Map.Entry<String, Integer> me:hm.entrySet()) {
			
			System.out.print(me.getKey()+" :");
			System.out.println(me.getValue());
			
		}
		

	}

}
