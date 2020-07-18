package com.vectorincollections.learnings;

import java.util.Vector;

public class ConvertList2Array {

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
		
		String[] array = vlist.toArray(new String[vlist.size()]);
		
		for(String temp : array) {
			System.out.println(temp);
		}


	}

}
