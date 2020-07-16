package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class CloneLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		LinkedList<String> llist2 = new LinkedList<String>();
		
		System.out.println("Before clone" +llist2);
		
		llist2 = (LinkedList<String>) llist.clone();
		
		System.out.println(llist2);
	}

}
