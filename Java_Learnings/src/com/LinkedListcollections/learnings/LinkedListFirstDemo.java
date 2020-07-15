package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class LinkedListFirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> llist = new LinkedList<String>();
		
		//adding element in linked list
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		
		System.out.println("display the elements : "+llist);
		
		//Adding an element tp the first position by using addFirst() method
		llist.addFirst("One");
		
		System.out.println("Display the elements after adding to the first position : "+llist);
		
		// Adding an element to the last position by using addLast() method
		llist.addLast("Five");
		
		System.out.println("Display the elements after adding to the last position : "+llist);
		
		//Adding an element to the specific position by using index(int) method
		
		llist.add(5, "Six");
		
		System.out.println("Display the elements after to the 6th position : "+llist);
		
		
		
		
		
	}

}
