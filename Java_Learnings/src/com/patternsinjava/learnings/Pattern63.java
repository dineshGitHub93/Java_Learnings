package com.patternsinjava.learnings;

public class Pattern63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=1;
		int n=5;
		int p_height =n-1; 
		
		for(int i=1;i<=5;i++) {
			for(int j=p_height;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=m;k++) {
				System.out.print(" "+k);
			}
			
			System.out.println();
			m+=2;
		}

	}

}
