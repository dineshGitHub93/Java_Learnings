package com.LinkedListcollections.learnings;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		
		System.out.println(llist);
		
		//Iterate the LinkedList by loops
		
		// for loops
		for (int i = 0; i < llist.size(); i++) {
			
			System.out.println(" for loops after values "+llist.get(i));
			
		}
		//for each
		
		for(String temp :llist) {
			System.out.println(" for each loops after values "+temp);
		}
		
		//while loop
		int i =0;
		while(i<llist.size()) {
			System.out.println(llist.get(i));
			i++;
		}
		
		//Iterator
		Iterator<String> ite = llist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
