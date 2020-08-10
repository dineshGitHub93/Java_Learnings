package com.patternsinjava.learnings;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int p=1;
		
		for(int i=1; i<=n;i++) {
			
			for(int j=n-1; j>=i; j--) {
				
				System.out.print(" ");
			}
			for(int k=1; k<=p;k++) {
				System.out.print("*");
			}
			p=+2;
			System.out.println();
		}
	}

}
