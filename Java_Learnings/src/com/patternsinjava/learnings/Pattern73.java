package com.patternsinjava.learnings;

public class Pattern73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p_height=4;
		int max_value=p_height*2-1;
		int p_space =p_height-1;
		
		for(int i=p_height;i>=1;i--) {
			for(int j=p_space;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=max_value;k++) {
				System.out.print(" "+k);
			}
			
			max_value-=2;
			System.out.println();

	}

}
}
