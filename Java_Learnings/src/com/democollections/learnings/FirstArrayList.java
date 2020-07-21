package com.democollections.learnings;

public class FirstArrayList {
	
	public static void main(String[] args) {
		
		WrittenArrayList<String> demo = new WrittenArrayList<String>();
		
		System.out.println(demo);
		
		demo.ensureCapacity(8);
		
		System.out.println();
		
		WrittenArrayList<Integer> demo1 = new WrittenArrayList<Integer>();
		
		demo1.add(20);
		demo1.add(10);
		demo1.add(100);
		demo1.add(90);
		demo1.add(60);
		
		System.out.println(demo1.parallelStream());
		
		
		
	}

}
