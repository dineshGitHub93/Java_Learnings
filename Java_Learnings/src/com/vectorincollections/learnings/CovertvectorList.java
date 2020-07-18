package com.vectorincollections.learnings;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CovertvectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a vector
		Vector<String> vlist = new Vector<String>();
		
		//Add an element in vector
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		vlist.add("Five");
		
		//Diaply the element which is available in vector
		System.out.println("vector element : "+vlist);
		
		List<String> list = Collections.list(vlist.elements());
		
		// iterating the elements
		Iterator<String> ite =list.iterator();
		System.out.println("\n");
		//print the iterate
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		

	}

}
