package com.mapincollections.learnings;

import java.util.HashMap;

public class EmptyCheckHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a HashMap
	    HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
	 
	 
	    // Checking whether HashMap is empty or not
	    /* isEmpty() method signature and description -
	     * public boolean isEmpty(): Returns true if this map 
	     * contains no key-value mappings.*/
	    System.out.println(hmap);
	    System.out.println("Check Whether HashMap is Empty : "+hmap.isEmpty());
	   
	    hmap.put(1, "Value1");
	    System.out.println(hmap);
	    System.out.println("Check Whether HashMap is Empty : "+hmap.isEmpty());
	}

}
