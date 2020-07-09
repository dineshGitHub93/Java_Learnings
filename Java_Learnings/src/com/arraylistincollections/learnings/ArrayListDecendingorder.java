package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayListDecendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList< String> str = new ArrayList<String>(
				
				Arrays.asList("A","B","C","D","E","F"));
		
		for(int i=0; i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
		Collections.sort(str, Collections.reverseOrder());
		System.out.println("\n");
		for(String str1 : str) {
			
			System.out.println(str1);
		}
		System.out.println("\n");
		Collections.sort(str);
		
		int i=0;
		while(i<str.size()) {
			System.out.println(str.get(i));
			i++;
		}
		
		System.out.println("\n");
		Collections.sort(str);
		Collections.reverseOrder();
		
		Enumeration<String> e = Collections.enumeration(str);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
	}

}
