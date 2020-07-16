package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class PeakInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		System.out.println("Linked List data : "+llist);
		
		System.out.println("Get first element in LinkedList : "+llist.peek());
		System.out.println(llist);
		
		System.out.println("First occurence : "+llist.peekFirst());
		System.out.println("Last occurance : "+llist.peekLast());
		
	}

}
