package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList< String> alist = new ArrayList<String>();
		alist.add("hi");
		alist.add("How are you");
		alist.add("Good Morning");
		alist.add("bye");
		alist.add("Good night");
		
		ArrayList<String> alist2 = new ArrayList<String>();
		alist2.add("Howdy");
		alist2.add("Good Evening");
		alist2.add("bye");
		alist2.add("Good night");
		
		//Storing the comparison output in ArrayList
		ArrayList<String> al3 = new ArrayList<String>();
		
		for(String temp1:alist) {
			al3.add(alist2.contains(temp1) ? "Yes" : "No");
		}
			System.out.println(al3);
		
		
		//Storing the comparison output in ArrayList
		ArrayList<String> al4 = new ArrayList<String>();
		for(String temp2 : alist) {
			al4.add(alist2.contains(temp2) ? "1" : "0");
		}
			System.out.println(al4);
		

	}

}
