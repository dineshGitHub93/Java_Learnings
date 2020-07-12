package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAddAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>(
				
				Arrays.asList("Dinesh", "Vignesh", "Akash"));
		
				System.out.println(alist);
				
				ArrayList<String> al = new ArrayList<String>() {{
					
					
					add("One");
					add("two");
					add("three");
					add("Four");	
				}};
				
				al.addAll(alist);
				
				System.out.println(al);
				
				al.addAll(7, al);
				System.out.println(al);
				
	}

}
