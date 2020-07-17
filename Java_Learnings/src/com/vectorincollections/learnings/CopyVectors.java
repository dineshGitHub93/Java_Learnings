package com.vectorincollections.learnings;

import java.util.Collections;
import java.util.Vector;

public class CopyVectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vlist = new Vector<String>();
		vlist.add("One");
		vlist.add("Two");
		vlist.add("Three");
		vlist.add("Four");
		
		Vector<String> CopyList = new Vector<String>();
		
		CopyList.add("1");
		CopyList.add("2");
		CopyList.add("3");
		CopyList.add("4");
		CopyList.add("5");
		CopyList.add("6");
		CopyList.add("7");
		CopyList.add("8");
		
		//Display both vector values before copy operation
		System.out.println(vlist);
		System.out.println(CopyList);
		
		Collections.copy(CopyList, vlist);
		System.out.println("After copying elements : \n");
		for(String temp:CopyList) {
			System.out.println(temp);
		}

		
	}

}
