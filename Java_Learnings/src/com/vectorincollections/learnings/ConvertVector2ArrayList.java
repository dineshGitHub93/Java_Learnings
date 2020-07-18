package com.vectorincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ConvertVector2ArrayList {

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
		
		//Convert vector to ArrayList
		ArrayList<String> alist = new ArrayList<String>(vlist);
		
		System.out.println(alist);
		
		


	}

}
