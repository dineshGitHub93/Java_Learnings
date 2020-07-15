package com.LinkedListcollections.learnings;

import java.sql.Array;
import java.util.LinkedList;

public class LinkedListaddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(2);
		llist.add(5);
		llist.add(6);
		llist.add(7);
		
		LinkedList<Integer> llist1 = new LinkedList<Integer>();
		
		llist1.add(8);
		llist1.add(9);
		llist1.add(10);
		
		llist.addAll(llist1);
		
		System.out.println("Adding all value into one LinkedList : "+llist);
		
		LinkedList<Integer> llist3 = new LinkedList<Integer>();
		llist3.add(3);
		llist3.add(4);
		
		llist.addAll(2, llist3);
		
		System.out.println("Adding a LinkedList to the specific position : "+llist);
		

	}

}
