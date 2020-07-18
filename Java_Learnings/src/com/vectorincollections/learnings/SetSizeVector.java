package com.vectorincollections.learnings;

import java.util.Vector;

public class SetSizeVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> str = new Vector<String>();
		
		str.add("One");
		str.add("Two");
		str.add("Three");
		str.add("Four");
		
		//Display vector element:
		System.out.println("vector Element : "+ str + " & Vector Size : "+str.size());
		
		str.setSize(7);
		
		for(int i = 0; i<str.size(); i++) {
			System.out.println(str.get(i));
		}
		
		str.setSize(4);
		System.out.println("\n");
		for(String temp :str) {
			System.out.println(temp);
		}
	}

}
