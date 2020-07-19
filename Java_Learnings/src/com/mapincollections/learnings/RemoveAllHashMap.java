package com.mapincollections.learnings;

import java.util.HashMap;

public class RemoveAllHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 // Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(11,"Value1");
	    hashmap.put(22,"Value2");
	    hashmap.put(33,"Value3");
	    hashmap.put(44,"Value4");
	    hashmap.put(55,"Value5");
	    hashmap.put(66,"Value6");
	    
	    //Displaying HashMap elements 
	    System.out.println("HashMaps Elements : "+hashmap);
	    hashmap.clear();
	    System.out.println("HashMaps Elements : "+hashmap);
	    
	    
	    
	}

}
