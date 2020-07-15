package com.LinkedListcollections.learnings;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListItrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		ListIterator<String> listIterator = llist.listIterator();
		
		// Iterate the element to forward
		
		System.out.println("Iterate the element to forward \n");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		
		System.out.println("\nIterate the element to previous");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
