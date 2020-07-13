package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> alist = Collections.synchronizedList(new ArrayList<String>());
		alist.add("Java");
		alist.add("c");
		alist.add("c++");
		alist.add("Node Js");
		alist.add("react");
		alist.add("JavaScript");

		for(String temp:alist) {
			System.out.println(temp);
		}
		System.out.println("\n");
		Collections.swap(alist, 1, 4);
		
		for(String temp:alist) {
			System.out.println(temp);
		}
	}

}
