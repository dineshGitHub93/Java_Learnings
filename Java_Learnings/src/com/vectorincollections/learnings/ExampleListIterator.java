package com.vectorincollections.learnings;

import java.util.ListIterator;
import java.util.Vector;

public class ExampleListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create vector
		Vector<String> vlist = new Vector<String>();
		
		// Add an element in vector
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		vlist.add("Six");
		
		//Create List Iterator method
		ListIterator<String> li = vlist.listIterator();
		
		// print the element in order mode
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("\n");
		
		// Print the element reverse order
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
