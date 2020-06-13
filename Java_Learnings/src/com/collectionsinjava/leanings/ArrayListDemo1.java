package com.collectionsinjava.leanings;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Creating an array list
			ArrayList<String> list = new ArrayList<String>(); 
			
			
			// Adding object in ArrayList
			list.add("Java");
			list.add("Python");
			list.add("Java Script");
			
			// Traversing list through Iterator
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	}

}
