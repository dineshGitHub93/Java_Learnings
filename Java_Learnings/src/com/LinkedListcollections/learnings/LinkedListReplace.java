package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class LinkedListReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		// Displaying the elements
		System.out.println(llist);
		
		//replace the value "six" by "seven"
		llist.set(5, "Seven");
		
		System.out.println(llist);
		
		
	}

}
