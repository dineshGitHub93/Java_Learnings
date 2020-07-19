package com.setincollections.learnings;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class EndtoEndTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("One");
		tset.add("Two");
		tset.add("Three");
		tset.add("Four");
		tset.add("Five");
		
		TreeSet<Integer> tset1 = new TreeSet<Integer>();
		tset1.add(1);
		tset1.add(2);
		tset1.add(3);
		tset1.add(4);
		tset1.add(5);
		
		System.out.println(" TreeSet String Element : "+tset);
		System.out.println(" TreeSet Integer Element : "+tset1);
		
		System.out.println("Contain Method : "+tset.contains("One"));
		System.out.println("First method "+tset.first());
		System.out.println("Last method "+tset.last());
		System.out.println("PollFirst method "+tset1.pollFirst());
		System.out.println("PollLast method "+tset1.pollLast());
		tset.add("Seven");
		System.out.println("Method After Add : "+tset);
		tset1.add(8);
		System.out.println("Method After Add : "+tset1);
		System.out.println("Size of TreeSet : "+tset.size());
		TreeSet<Object> tSet2 = new TreeSet<Object>();
		System.out.println("Add All element in new treeSet "+tSet2.addAll(tset));
		System.out.println("TreeSet Element "+tSet2);
		System.out.println(tSet2.containsAll(tset));
		TreeSet<String> tset3 = new TreeSet<String>();
		tset3.clone();
		System.out.println(""+tset3);
		System.out.println("SubSet Method "+tset.subSet("Five", "Three"));
		System.out.println("Check Empty : "+tset3.isEmpty());
		System.out.println("Remove "+tset1.remove(4));
		System.out.println(""+tset1);

			TreeSet<String> treverse = (TreeSet<String>)tset.descendingSet();
			
				System.out.println(tset);
				System.out.println(treverse);
				
				Iterator<String> ite = tset.descendingIterator();
				while(ite.hasNext()) {
					System.out.println(ite.next());
				}
		
				Iterator<String> ite1 = tset.iterator();
				while(ite1.hasNext()) {
					System.out.println(ite1.next());
				}
	}

}
