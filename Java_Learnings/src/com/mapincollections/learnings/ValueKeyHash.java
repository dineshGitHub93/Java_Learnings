package com.mapincollections.learnings;

import java.util.HashMap;
import java.util.Map;

public class ValueKeyHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Map<String, Integer> hm = new HashMap<String, Integer>();
			
			hm.put("Dinesh", 27);
			hm.put("Akash", 22);
			
			for(Map.Entry ele :hm.entrySet()) {
				System.out.println(ele.getKey() + " : "+ele.getValue());
			}
	}

}
