package com.patternsinjava.learnings;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i<=j) {
					System.out.print("  ");
				}
				else {
					System.out.print(" "+(char)(i+63));
				}
				}
			System.out.println();

		}

	}

}
