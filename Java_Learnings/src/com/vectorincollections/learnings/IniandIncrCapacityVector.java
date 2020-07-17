package com.vectorincollections.learnings;

import java.util.Vector;

public class IniandIncrCapacityVector {

	public static void main(String[] args) {
		// The initial capacity is 4 and capacityIncrement is 6
		
		Vector<Integer> vlist = new Vector<Integer>(3, 2);
		
		vlist.add(1);
		vlist.add(1);
		vlist.add(1);
		System.out.println("initialize capacity of vector is : "+vlist.capacity());
		vlist.add(4);
		System.out.println("Incrmental capacity of vector is : "+vlist.capacity());
		
		System.out.println("Vector value is "+vlist);
	}

}
