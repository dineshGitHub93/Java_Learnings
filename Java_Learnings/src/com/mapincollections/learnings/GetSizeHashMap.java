package com.mapincollections.learnings;

import java.util.HashMap;

public class GetSizeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "One");
		hmap.put(5, "Five");
		hmap.put(10, "Ten");
		hmap.put(8, "Eight");
		hmap.put(9, "Nine");
		
		System.out.println("Size of HashMap : "+hmap.size());

	}

}
