package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorrtWithComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentDemo> alist = new ArrayList<StudentDemo>();
		alist.add(new StudentDemo("Dinesh",1001,27));
		alist.add(new StudentDemo("Vignesh",1003,27));
		alist.add(new StudentDemo("Uday",1001,27));
		
		Collections.sort(alist);
		
		for(StudentDemo str:alist) {
			System.out.println(str);
		}
		
	}

}
