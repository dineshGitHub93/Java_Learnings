package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class EnumIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<Integer>() {{
			
				add(1);
				add(2);
				add(3);
		
		}};
		
		// Get the enumeration object
		Enumeration<Integer> e = Collections.enumeration(num);
		//Enumeration through the ArrayList elements
		System.out.println("ArrayList elemenents: ");
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

}
}