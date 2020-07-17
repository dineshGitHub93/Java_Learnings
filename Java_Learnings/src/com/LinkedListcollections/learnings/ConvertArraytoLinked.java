package com.LinkedListcollections.learnings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertArraytoLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("One");
		alist.add("Two");
		alist.add("Three");
		alist.add("Four");
		alist.add("Five");
		
		List<String> llist = new LinkedList<String>(alist);
		
		System.out.println(llist);
		

	}

}
