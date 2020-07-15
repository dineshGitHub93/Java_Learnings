package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class LinkedListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		llist.add("Seven");
		llist.add("Eight");
		llist.add("Nine");
		
		System.out.println("Adding elements in LinkedList : "+llist);
		
		//Adding element in LinkedList to the first & Last position 
		
		llist.addFirst("One");
		llist.addLast("Ten");
		
		System.out.println("LinkedList after add & last element : "+llist);
		
		// get & set element from LinkedList
		
		String getFirstElement = llist.getFirst();
		String getLastElement = llist.getLast();
		String getSpecificElement = llist.get(5);
		
		System.out.println("Get elements from LinkedList : "+getFirstElement +" , "+getLastElement + " , "+getSpecificElement);

		//set 
		 llist.set(9, "11");
		 String getSetElement = llist.get(9);
		 llist.set(0, "-1");
		 String getSetelement = llist.get(0);
		
		System.out.println("display set elements from LinkedList : "+getSetElement +" , "+getSetelement);
		
		
		//Remove element
		llist.removeFirst();
		llist.removeLast();
		
		System.out.println("display after use remove method : "+llist);
		
		llist.add(0, "One");
		llist.remove(8);
		
		System.out.println("Final Content : "+llist);
	}

}
