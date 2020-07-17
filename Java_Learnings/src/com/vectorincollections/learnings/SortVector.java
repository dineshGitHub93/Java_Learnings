package com.vectorincollections.learnings;

import java.util.Collections;
import java.util.Vector;

public class SortVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vlist = new Vector<String>();
		
		vlist.add("Google");
		vlist.add("Yahoo");
		vlist.add("Baid");
		vlist.add("Apple");
		vlist.add("Redmi");
		
		//Display the vector value by given order
		for(int i =0; i<vlist.size();i++) {
			System.out.println(vlist.get(i));
		}
		
		Collections.sort(vlist);
		System.out.println("\n");
		//Display the vector value after sorting
		for(int i =0; i<vlist.size();i++) {
			System.out.println(vlist.get(i));
		}
		
		

	}

}
