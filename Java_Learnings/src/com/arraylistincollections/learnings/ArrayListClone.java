package com.arraylistincollections.learnings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> synlist = new ArrayList<String>();
		synlist.add("Java");
		synlist.add("python");
		synlist.add("C");
		synlist.add("C++");
		synlist.add("spring");
		synlist.add("hibernet");
		
		ArrayList<String> clonelist =(ArrayList<String>)synlist.clone();
		System.out.println("Clone data :" +clonelist);
		
		synlist.remove(2);
		System.out.println("After remove the index 2 from Original ArrayList : "+synlist);
		// After clone from parent , if any change made in it , will affect the child
		System.out.println(clonelist);
		
		//clear all data from synlist
		synlist.clear();
		System.out.println("After clear synlist : "+synlist);
		System.out.println("To check whether the ArrayList is empty :"+synlist.isEmpty());
		// Copy the data from cloned arrayList
		synlist.addAll(clonelist);
		System.out.println("Copied data from clonelist : "+synlist);
		System.out.println("To check whether the ArrayList is empty :"+synlist.isEmpty());
		
		System.out.println("Size of ArrayList is : "+synlist.size());
		synlist.trimToSize();
		synlist.add("Node-Js");
		System.out.println(synlist);
		
		synlist.set(1, "JavaScript");
		System.out.println(synlist);
	}

}

