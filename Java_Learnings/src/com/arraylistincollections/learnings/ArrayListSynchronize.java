package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronize {
	
	/**
	 * 
	 * There are two ways to synchronize explicitly:
	 *	
	 *	1) Using Collections.synchronizedList() method
	 *	2) Using thread-safe variant of ArrayList: CopyOnWriteArrayList
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> syncal = 
				Collections.synchronizedList(new ArrayList<String>());
			
		syncal.add("Pen");
		syncal.add("ball");
		syncal.add("bat");
		
		System.out.println("Iterating synchronized ArrayList \n");
		synchronized (syncal) {
			
			Iterator<String> ite = syncal.iterator();
			
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}
			
		}
		
		

	}

}
