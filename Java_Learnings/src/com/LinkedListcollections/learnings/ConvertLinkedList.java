package com.LinkedListcollections.learnings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList< String> llist = new LinkedList<String>();
		
		llist.add("One");
		llist.add("Two");
		llist.add("Three");
		llist.add("Four");
		llist.add("Five");
		llist.add("Six");
		
		List<String> list = new ArrayList<String>(llist);
		
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
