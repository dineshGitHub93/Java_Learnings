package com.patternsinjava.learnings;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=n;j>=i;j--) {
				System.out.print(" @");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+(char)(k+64));
			}
			System.out.println();
			
		}

	}

}
