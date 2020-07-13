package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> alist = new ArrayList<String>();
			alist.add("pen");
			alist.add("pencil");
			alist.add("ink");
			alist.add("notebook");
			
			System.out.println("ArrayList contains the strings 'pen' : "+alist.contains("pen"));
			System.out.println("ArrayList contains the strings 'pencil' : "+alist.contains("pencl"));
			System.out.println("ArrayList contains the strings 'pen' : "+alist.contains("pen"));
			System.out.println("ArrayList contains the strings 'ink' : "+alist.contains("ink"));
			System.out.println("ArrayList contains the strings 'notebook' : "+alist.contains("notebook"));
			
			ArrayList<Integer> alist1 = new ArrayList<Integer>(
					Arrays.asList(12,23,14,15,16,17,18));
			
			System.out.println("Element '12' is present in the arrayList : "+alist1.contains(12));
			System.out.println("Element '23' is present in the arrayList : "+alist1.contains(23));
			System.out.println("Element '14' is present in the arrayList : "+alist1.contains(14));
			System.out.println("Element '15' is present in the arrayList : "+alist1.contains(15));
			System.out.println("Element '16' is present in the arrayList : "+alist1.contains(16));
			System.out.println("Element '17' is present in the arrayList : "+alist1.contains(17));
			System.out.println("Element '18' is present in the arrayList : "+alist1.contains(18));
			
	}
}
