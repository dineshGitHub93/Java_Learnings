package com.patternsinjava.learnings;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char i;
		char j;
			for(i='A';i<='E';i++) {
				for(j='E';j>='A';j--) {
					System.out.print(j+" ");
				}
				System.out.println();
			}

	}

}
