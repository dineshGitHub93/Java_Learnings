package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListGetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> alist = new ArrayList<String>() {{
				
				add("one");
				add("two");
				add("Three");
				add("Four");
				add("Five");
				add("six");
				add("Seven");
				add("Eight");
				add("Nine");
				add("Ten");
				
			}};
			
			System.out.println("Get First element from the arrayList"+alist.get(0));
			System.out.println("Get Secound element from the arrayList"+alist.get(1));
			System.out.println("Get Third element from the arrayList"+alist.get(2));
			System.out.println("Get Fourth element from the arrayList"+alist.get(3));
			System.out.println("Get Fifth element from the arrayList"+alist.get(4));
			
	}

}
