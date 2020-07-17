package com.LinkedListcollections.learnings;

import java.util.LinkedList;

public class ConvertLinkedListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		// Convert Linked List to Array 
		
		String[] array =llist.toArray(new String[llist.size()])  ;
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
				

	}

}
