package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListlooping {
	
	public static void main (String args[]) {
		
		ArrayList<String> alist = new ArrayList<String>(
				
				Arrays.asList("Java", "python","C","C++")); 
		
		//for loop 
		for(int i =0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("\n");
		// for each loop
		
		for(String str:alist) {
			System.out.println(str);
		}
		
		System.out.println("\n");
		int i=0;
		while(i<alist.size()) {
			System.out.println(alist.get(i));
			i++;
		}
		
		System.out.println("\n");
		
		Iterator<String> itr = alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
	}

}
