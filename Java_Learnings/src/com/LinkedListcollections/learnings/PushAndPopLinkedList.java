package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class PushAndPopLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		System.out.println("Remove First element");
		llist.removeFirstOccurrence("One");
		System.out.println(llist);
		
		llist.push("One");
		
		System.out.println(llist);
		
		llist.pop();
		System.out.println(llist);
		

	}

}
