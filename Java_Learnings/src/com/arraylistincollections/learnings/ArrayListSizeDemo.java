package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> str = new ArrayList<String>(Collections.nCopies(3, "NodeJs"));
		
		System.out.println("Size of ArrayList is :"+str.size());
		
		str.add("React");
		str.add("Jquary");
		
		System.out.println("Current size of ArrayList is :"+str.size());
		
		str.remove(1);
		System.out.println("After removing one value :" +str.size());

	}

}
