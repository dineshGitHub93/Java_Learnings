package com.mapincollections.learnings;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map<Integer, String> tmap = new TreeMap<Integer, String>();
			
			tmap.put(new Integer(1), "One");
			tmap.put(new Integer(2), "Two");
			tmap.put(3, "Three");
			
			System.out.println(tmap);
			
			for(Map.Entry element : tmap.entrySet()) {
				
				System.out.println(element.getKey() +" "+element.getValue());
			}
	}

}
