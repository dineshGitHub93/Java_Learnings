package com.arraylistincollections.learnings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.stream.Collectors;

public class ArrayListSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<Integer>(
				
				Arrays.asList(1,24,5,7,0,12));
		
		for(int i=0; i<num.size();i++) {
			System.out.println(num.get(i));
		}
		
		Collections.sort(num);
		
		// Get the enumeration object
				Enumeration<Integer> e = Collections.enumeration(num);
				//Enumeration through the ArrayList elements
				System.out.println("ArrayList elemenents: ");
				
				while(e.hasMoreElements())
					System.out.println(e.nextElement());

	}

}
