package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class ChangetheElementinHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		//Inserting the element
		hm.put(new Integer(1), "Greek");
		hm.put(new Integer(2), "for");
		hm.put(new Integer(3), "Greeks");
		
		System.out.println(hm);
		
		hm.put(2, "greeks");
		
		System.out.println(hm);
		

	}

}
