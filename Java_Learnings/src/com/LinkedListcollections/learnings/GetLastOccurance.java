package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class GetLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		llist.add("Nine");
		llist.add("One");
		llist.add("Eighty");
		llist.add("Ten");
		llist.add("eleven");
		llist.add("Twevel");
		llist.add("One");
		llist.add("One");
		llist.add("Three");
		llist.add("Five");
		llist.add("Six");
		llist.add("Five");
		llist.add("Six");
		
		System.out.println(llist);
		
		System.out.println("Display the first & Last Occurance ");
		System.out.println("Last Index of three "+llist.lastIndexOf("Three"));
		System.out.println("First Index of One "+llist.lastIndexOf("One"));
		
		System.out.println("Remove last occurence of THREE : "+llist.removeLastOccurrence("Three"));
		
		System.out.println(llist);
		
		System.out.println("Remove First occurence of ONE : "+llist.removeFirstOccurrence("One"));
		
		System.out.println(llist);
		
		System.out.println("Last Index of three "+llist.lastIndexOf("Three"));
		System.out.println("First Index of One "+llist.lastIndexOf("One"));
	}

}
