package com.patternsinjava.learnings;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i>=j) {
					System.out.print(" "+(char)(i+64));
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
