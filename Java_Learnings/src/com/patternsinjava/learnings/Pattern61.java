package com.patternsinjava.learnings;

public class Pattern61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n=5;
			int px=5,py=5,i,j;
			
			for(i=1;i<=5;i++) {
				for(j=1;j<=n*2;j++) {
					if(j>=px && j<=py) {
						System.out.print(" "+j);
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
				px--;
				py++;
			}
	}

}
