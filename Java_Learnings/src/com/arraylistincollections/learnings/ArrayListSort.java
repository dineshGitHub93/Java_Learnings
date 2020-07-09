package com.arraylistincollections.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> countries = new ArrayList<String>(
				
				Arrays.asList("India", "America", "Rushia","China"));
		
		for(int i = 0; i<countries.size();i++) {
			System.out.println(countries.get(i));
		}
			
		Collections.sort(countries);
		
		System.out.println("\n");
		for(String str : countries ) {
			
				System.out.println(str);
		}

}
}