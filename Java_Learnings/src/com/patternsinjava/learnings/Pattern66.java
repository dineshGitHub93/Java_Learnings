package com.patternsinjava.learnings;

public class Pattern66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=1;
		int n=5;
		int p_height =n-1; 
		
		for(int i=1;i<=5;i++) {
			for(int j=p_height;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=m;k>=1;k--) {
				System.out.print(" "+(char)(k+64));
			}
			
			System.out.println();
			m+=2;
		}
	}

}
