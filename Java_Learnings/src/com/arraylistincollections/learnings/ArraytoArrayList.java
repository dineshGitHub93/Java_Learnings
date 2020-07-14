package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraytoArrayList {

	public static void main(String[] args) {
		//Array Declaration and initialization
		String citinames[] = {"Java","JavaScript","Hibernet","Spring","Node-js"};
		
		//Array to ArrayList
		ArrayList<String> cityLit = new ArrayList<String>(Arrays.asList(citinames));
		
		/*  Adding new elements to the Converted List*/
		
		cityLit.add("New City2");
		cityLit.add("New City2");
		
		
		/*Final ArrayList content display using for*/
		for(String str:cityLit) {
			System.out.println(str);
		}
		
		System.out.println("\n");
			ArrayList<String> alist = new ArrayList<String>();
			Collections.addAll(alist, citinames);
			
			System.out.println(alist);
			
		ArrayList<String> alist1 = new ArrayList<String>();
		
		for(int i = 0; i<citinames.length;i++) {
			
			alist1.add(citinames[i]);
		}
		System.out.println("\n");
		
		for(String temp:alist1) {
			
			System.out.println(temp);
			
		}
	}

}
