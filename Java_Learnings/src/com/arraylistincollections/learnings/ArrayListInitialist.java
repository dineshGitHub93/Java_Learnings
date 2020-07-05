package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListInitialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> alist = new ArrayList<String>();
			ArrayList<Integer> alist1 = new ArrayList<Integer>();
			
			alist.add("One");
			alist.add("Two");
			alist.add("Three");
			alist.add("Four");
			
			//displaying elements
			System.out.println(alist);
			
			alist1.add(10);
			alist1.add(20);
			alist1.add(30);
			alist1.add(50);
			
			System.out.println(alist1);
			
			//Adding "Five" at fourth position 
			alist.add(4, "Five");
			
			System.out.println(alist);
			
			//Adding 40 at 3rd position
			alist1.add(3, 40);
			
			System.out.println(alist1);
			
	}

}
