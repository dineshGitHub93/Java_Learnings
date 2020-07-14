package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListConverttoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Java");
		alist.add("JavaScript");
		
		String[] array = new String[alist.size()];
		for(int j = 0; j<alist.size();j++) {
		
		array[j] =alist.get(j);
		}
		
		for(String temp: array) {
			System.out.println(temp);
		}
		
		System.out.println("\n");
		
		String[] str = alist.toArray(new String[alist.size()]);
		
		for(String k:str) {
			System.out.println(k);
		}

	}
	

}
