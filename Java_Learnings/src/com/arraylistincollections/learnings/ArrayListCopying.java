package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>(
				
				Arrays.asList("Text 1", "Text 2", "Text 3"));
		ArrayList<String> alist2 = new ArrayList<String>() {{
			
			add("Text 4");
			add("Text 5");
			add("Text 6");
		}};
		
		alist2.addAll(alist);
		
		System.out.println(alist2);
		
		System.out.println("Remove the method check");
		alist2.remove(0);
		System.out.println(alist2);
		
		System.out.println("Remove specified element from ArrayList");
		alist2.remove("Text 5");
		
		System.out.println(alist2);

	}

}
