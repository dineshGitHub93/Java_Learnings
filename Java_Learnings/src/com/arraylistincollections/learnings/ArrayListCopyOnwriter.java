package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListCopyOnwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			CopyOnWriteArrayList<String> cwlist = new CopyOnWriteArrayList<String>(
					Arrays.asList("Java","Node-Js","React","JavaScript","Spring"));
			
			List<String> syncal = Collections.synchronizedList(new ArrayList<String>());
			
			syncal.add("Hibernet");
			syncal.add("HTML");
			syncal.add("CSS");
			syncal.add("Java");
			syncal.add("React");
			syncal.add("Spring");
			
			ArrayList<String> comList = new ArrayList<String>();
			System.out.println(" Compare to synchronized ArrayList ");
			
			for(String temp : cwlist) {
				comList.add(syncal.contains(temp)? "Yes" : "No");
			}
			System.out.println(comList);
			
	}

}
