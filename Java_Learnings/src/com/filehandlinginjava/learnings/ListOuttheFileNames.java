package com.filehandlinginjava.learnings;

import java.io.File;

public class ListOuttheFileNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Java_Learnings\\Textfile");
		String[] s= f.list();
		for(String a:s) {
			count++;
			System.out.println(a);
		}
		System.out.println("The Total Number : "+count);

	}

}
