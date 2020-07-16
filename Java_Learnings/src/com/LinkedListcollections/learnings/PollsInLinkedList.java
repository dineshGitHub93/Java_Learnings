package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class PollsInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		System.out.println(llist);
		
	
		
		System.out.println("remove the value of 1st index : "+llist.poll());
		
		System.out.println(llist);
		
		System.out.println("Retrive or remove the element at the first position : "+llist.pollFirst());
		System.out.println("After using the pollFirst Method \n"+llist);
		
		System.out.println("Retrive or remove the element at the last position : "+llist.pollLast());
		
		System.out.println("After using the pollLast \n"+llist);
	}

}
