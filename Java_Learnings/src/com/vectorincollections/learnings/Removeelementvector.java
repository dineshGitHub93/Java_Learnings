package com.vectorincollections.learnings;

import java.util.Vector;

public class Removeelementvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vlist = new Vector<String>();
		
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		vlist.add("Six");
		vlist.add("Seven");
		vlist.add("Eight");
		
		// Display the elements which is available in Vector
		System.out.println(" Vector elements "+vlist);
		
		//Remove element by specific data
		System.out.println("Remove element seven : "+(vlist.remove("Seven") ? "Removed" : "Not Removed "));
		
		System.out.println("After remove the element : "+vlist);
		//Remove element by using Index
		System.out.println("Remove element index 6 : "+(vlist.remove(6) ) );
		
		//Display the element
		System.out.println("After Remove the element : "+vlist);
		
		//Remove all
		vlist.removeAllElements();
		
		System.out.println("Ater remove the all elements : "+vlist);
		
	}

}
