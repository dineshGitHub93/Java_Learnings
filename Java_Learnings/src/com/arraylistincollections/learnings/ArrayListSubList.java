package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist = new ArrayList<String>(
				
				Arrays.asList("One", "Two", "Three", "Four", "Five", "six", "Seven", "Eight"));
		
		System.out.println("Make a sublist of alist");
		//Sublist to ArrayList
		ArrayList<String> sublist = new ArrayList<String>(alist.subList(2, 5));
		
		System.out.println("Sublist of alist is : "+sublist);
		
		List<String> sub = alist.subList(5, 7);
		System.out.println("Sublist to list"+sub);
		
	}

}
