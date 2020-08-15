package com.patternsinjava.learnings;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>1 && i<5) {
					if(j>=2 && j<=4) {
						System.out.print("  ");
					}
					else {
						System.out.print(" *");
					}
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}

	}

}
