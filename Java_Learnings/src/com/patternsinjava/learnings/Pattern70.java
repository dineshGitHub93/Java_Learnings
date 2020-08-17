package com.patternsinjava.learnings;

public class Pattern70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int px=1;
		int py=n*2-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n*2;j++) {
				if(j>=px && j<=py) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
			px++;
			py--;
			System.out.println();
		}

	}

}
