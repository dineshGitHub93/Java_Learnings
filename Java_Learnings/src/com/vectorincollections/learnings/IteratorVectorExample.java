package com.vectorincollections.learnings;

import java.util.Iterator;
import java.util.Vector;

public class IteratorVectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// vector creation
		Vector<String> vlist = new Vector<String>();
		
		// Adding an element 
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		
		// Obtaining an iterator
		Iterator<String> ite = vlist.iterator();
		
		System.out.println("Display the vector element");
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
