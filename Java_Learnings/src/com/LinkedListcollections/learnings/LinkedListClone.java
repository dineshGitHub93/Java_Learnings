package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class LinkedListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("One"); 
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		
		LinkedList<String> llist1 = new LinkedList<String>();
		
		llist1.add("Six");
		llist1.add("Seven");
		
		System.out.println(llist1);

		llist1= 	(LinkedList<String>) llist.clone();
			
			System.out.println(llist1);
	}

}
