package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>(
				Arrays.asList("One","Two"));
		
		ArrayList<Object> alist1 = new ArrayList<Object>(
				Arrays.asList("One","Two",1));
		
				System.out.println(alist);
				System.out.println(alist1);
				
				

	}

}
