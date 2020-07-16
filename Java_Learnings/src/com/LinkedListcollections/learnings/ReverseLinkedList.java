package com.LinkedListcollections.learnings;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		//Displaying LinkedList element
		System.out.println(llist);
		
		 /* public Iterator<E> descendingIterator(): Returns an 
	      * iterator over the elements in this list in reverse 
	      * sequential order. The elements will be returned in 
	      * order from last (tail) to first (head).
	      */
		
		Iterator<String> ite = llist.descendingIterator();
		
		//Displaying list in reverse order
		System.out.println("Element in reverse order");
		while(ite.hasNext()) {
		System.out.println(ite.next());
		}
	}

}
