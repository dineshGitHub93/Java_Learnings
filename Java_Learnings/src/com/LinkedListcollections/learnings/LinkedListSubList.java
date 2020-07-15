package com.LinkedListcollections.learnings;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		
		Iterator<String> ite = llist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		 
		System.out.println("\nsubList final content \n");
		List<String> sublist = llist.subList(2, 5);
		
		for(String temp: sublist) {
			System.out.println(temp);
		}
		
		// If we have removed any item from sublist the same has been reflect to master
		
		sublist.remove(0);
		
		System.out.println("\nremove value from sublist");
		
		for(String temp : llist) {
			System.out.println(temp);
		}
		

	}

}
