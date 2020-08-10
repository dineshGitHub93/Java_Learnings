package com.patternsinjava.learnings;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i;
		char j;
		
		for(i='A';i<='E';i++) {
			for(j='A';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
