package com.LinkedListcollections.learnings;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);
		llist.add(6);
		
		System.out.println("Display the elements which is available in LinkedList ");
		Iterator<Integer> ite = llist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()); 
		}
		
		llist.removeFirst();
		llist.removeLast();
		
		System.out.println("\nAfter remove first & last element from LinkedList : \n ");
		
		for(int temp : llist) {
			System.out.println(temp);
		}
		
		// Remove a specific element from LinkedList
		
		llist.remove(3);
		System.out.println("\nAfter remove 3rd element from the LinkedList :\n");
		for (int i = 0; i < llist.size(); i++) {
			
			System.out.println(llist.get(i));
		}
	}

}
