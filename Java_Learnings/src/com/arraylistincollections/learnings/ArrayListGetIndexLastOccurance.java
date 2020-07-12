package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class ArrayListGetIndexLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<Integer> al = new ArrayList<Integer>();
					al.add(1);
			      al.add(88);
			      al.add(9);
			      al.add(17);
			      al.add(17);
			      al.add(9);
			      al.add(17);
			      al.add(91);
			      al.add(27);
			      al.add(1);
			      al.add(17);
			      
			      System.out.println("Last occurance of element 1 :"+al.lastIndexOf(1));
			      System.out.println("Last occurance of element 88 :"+al.lastIndexOf(88));
			      System.out.println("Last occurance of element 17 :"+al.lastIndexOf(17));
	
	}

}
