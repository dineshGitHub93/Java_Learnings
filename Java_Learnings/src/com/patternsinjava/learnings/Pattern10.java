package com.patternsinjava.learnings;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char i;
		char j;
		
		for(i='E';i>='A';i--) {
			for(j='A';j<='E';j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
