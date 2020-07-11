package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListAddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> Declaration
		ArrayList<String> alist = new ArrayList<String>();
		
		// Add Elements in ArrayList by using add method
		alist.add("one");
		alist.add("Two");
		alist.add("Three");
		alist.add("four");
		alist.add("five");
		
		System.out.println("Elements of ArrayList of String type : "+alist);
		
		ArrayList<Integer> alist1 = new ArrayList<Integer>();
		
		alist1.add(1);
		alist1.add(2);
		alist1.add(3);
		alist1.add(4);
		alist1.add(5);
		
		System.out.println("Elements of ArrayList of String type : "+alist1);
			
		alist.add(5, "six");
		alist.add(6, "Seven");
		
		System.out.println("Elements of ArrayList of String type : "+alist);
		
		alist1.add(5, 6);
		alist1.add(6, 7);
		
		System.out.println("Elements of ArrayList of String type : "+alist1);
		
	}

}
