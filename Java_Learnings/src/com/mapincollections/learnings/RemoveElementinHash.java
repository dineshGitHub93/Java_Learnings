package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementinHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub																						`	``		``	``	`	`	``	
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		//Insrerting the elements
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "Three");
		
		//Initial Map
		System.out.println(hm);
		
		hm.remove(2);
		System.out.println(hm);

	}

}
