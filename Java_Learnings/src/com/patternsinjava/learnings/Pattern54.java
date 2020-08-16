package com.patternsinjava.learnings;

public class Pattern54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=1;
		int n=5;
		int p_height = n-1,i,j,k;

			for(i=1;i<=5;i++) {
				for(j=p_height;j>=i;j--) {
					System.out.print("  ");
				}
				for(k=1;k<=m;k++) {
					System.out.print(" *");
				}
				System.out.println();
				m+=2;
			}

	}

}
