package com.patternsinjava.learnings;

public class Pattern31a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=n;i>=1;i-- ) {
			for(int j=n; j>=1;j--) {
				if(i>=j) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
					
				}
			
			}
			System.out.println();
		}

	}

}
