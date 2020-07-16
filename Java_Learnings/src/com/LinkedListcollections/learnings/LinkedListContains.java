package com.LinkedListcollections.learnings;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Adding element in linkedList
		LinkedList<String> llist = new 	LinkedList<String>();
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		llist.add("Seven");
		
		//Adding element in the LinkedList
		LinkedList<String> llist1 = new LinkedList<String>();
		llist.add("Two");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		//Check whether the elements exists in LinkedList
		
			
			String li = llist.contains("Six") ? "Yes":"No";
			System.out.println(li);
		
		
		

	}

}
