package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("A1 : E1");
		alist.add("A1 : E2");
		alist.add("A1 : E3");
		
		ArrayList<String> alist1 = new ArrayList<String>();
		alist.add("A2 : E1");
		alist.add("A2 : E2");
		alist.add("A3 : E3");
		
		ArrayList<String> join2Arraylist = new ArrayList<String>();
		join2Arraylist.addAll(alist);
		join2Arraylist.addAll(alist1);
		
		Iterator<String> ite = join2Arraylist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
