package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class AddingElementinHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm1 = new HashMap<>();
		
		//Map2
		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		
		// Inserting the elemeent
		
		hm1.put(1, "Greek");
		hm1.put(2, "For");
		hm1.put(3, "Greeks");
		
		hm2.put(new Integer(1), "Greek");
		hm2.put(new Integer(2), "for");
		hm2.put(new Integer(3), "Greeks");
		
		System.out.println(hm1);
		System.out.println(hm2);

	}

}
