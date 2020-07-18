package com.vectorincollections.learnings;

import java.util.Vector;

public class ReplaceElementVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Vector<String> str = new Vector<String>();
			str.add("One");
			str.add("One");
			str.add("Three");
			str.add("Four");
			str.add("Five");
			
			System.out.println("Vector element : "+str);
			
			str.set(1, "Two");
			
			System.out.println("Replace after vector element : "+str);
			
			str.setElementAt("One", 1);
			
			System.out.println("Replace after vector element : "+str);
			
			str.set(1, "Two");
			
			System.out.println("Replace after vector element : "+str);
			
			
	}

}
