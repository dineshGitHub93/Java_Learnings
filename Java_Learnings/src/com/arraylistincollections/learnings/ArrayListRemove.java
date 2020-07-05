package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>();
		ArrayList<Integer> alist1= new ArrayList<Integer>();
		
		alist.add("One");
		alist.add("two");
		alist.add("");
		alist.add("Four");
		alist.add(null);
		
		alist1.add(10);
		alist1.add(null);
		alist1.add(30);
		alist1.add(30);
		alist1.add(20);
		
		System.out.println(alist);
		System.out.println(alist1);
		
		//Replace empty value by "Three"
		alist.set(2, "Three");
		//Replace the null value by 20
		alist1.set(1, 20);
		
		System.out.println(alist);
		System.out.println(alist1);
		
		// Remove Null 
		alist.remove(null);
		alist.remove(2);
		
		System.out.println(alist);
		
		alist1.removeAll(alist1);
		
		System.out.println(alist1);


	}

}
