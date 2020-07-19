package com.setincollections.learnings;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.LinkedHashSet<String> lhset = new java.util.LinkedHashSet<String>();
		
		lhset.add("One");
		lhset.add("Two");
		lhset.add("Three");
		lhset.add("Four");
		lhset.add("Five");
		
		java.util.LinkedHashSet<Integer> tset1 = new java.util.LinkedHashSet<Integer>();
		
		tset1.add(1);
		tset1.add(2);
		tset1.add(3);
		tset1.add(4);
		tset1.add(5);
		
		System.out.println(lhset);
		System.out.println(tset1);
		
		
		System.out.println(" Contains "+tset1.contains("Four"));
		System.out.println("Remove "+tset1.remove(5));
		
		String[] array = lhset.toArray(new String[lhset.size()]);
		
		for(int i=0; i<lhset.size();i++) {
			System.out.println(array[i]);
		}
		
		Iterator<Integer> ite =  tset1.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		

	}

}
