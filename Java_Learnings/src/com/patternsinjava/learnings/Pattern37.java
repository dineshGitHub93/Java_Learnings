package com.patternsinjava.learnings;

public class Pattern37 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		int px = n; //left control 
		int py = n; //right control
 
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n*2;j++) {
				if(j>=px && j<=py) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			px--;
			py++;
			System.out.println();
		}
	}

}
