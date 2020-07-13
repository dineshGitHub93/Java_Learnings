package com.arraylistincollections.learnings;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayListStudent> alist = new ArrayList<ArrayListStudent>();
		alist.add(new ArrayListStudent("Dinesh",27));
		alist.add(new ArrayListStudent("Vignesg", 27));
		alist.add(new ArrayListStudent("Akash", 23));
		alist.add(new ArrayListStudent("Naresh", 22));
		alist.add(new ArrayListStudent("Kamesh", 19));
		
			for(ArrayListStudent temp : alist) {
					System.out.println(temp);
			}
	}

}
