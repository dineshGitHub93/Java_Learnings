package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj = new ArrayList<String>() {{
			
				add("One");
				add("two");
				add("Three");
			
		}};
System.out.println(obj);
	}

}
