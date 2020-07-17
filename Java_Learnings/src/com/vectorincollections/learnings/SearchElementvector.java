package com.vectorincollections.learnings;

import java.util.Vector;

public class SearchElementvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vlist = new Vector<String>();
		vlist.add("One");
		vlist.add("Five");
		vlist.add("Six");
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Seven");
		vlist.add("Three");
		vlist.add("One");
		vlist.add("Five");
		vlist.add("Three");
		vlist.add("Eight");
		vlist.add("Nine");
		vlist.add("Six");
		vlist.add("One");
		vlist.add("Seven");
		vlist.add("Ten");
		
		System.out.println("No of value in vector"+vlist.size());
		// This would return the index of first Occurrence:
		System.out.println(vlist.indexOf("Seven"));
		
		// This would return the index of last Occurrence:
		System.out.println(vlist.lastIndexOf("Seven"));
		
		//This would search the element backward starting from index 6(inclusive)
		System.out.println("Occurrence before index 2: "+vlist.lastIndexOf("One", 2));
		
		////This would start search from index 2(inclusive)
		System.out.println("Occurrence after index 2: "+vlist.indexOf("Seven", 12));
		
		

	}

}
