package com.filehandlinginjava.learnings;

import java.io.File;

public class ListOutOnlyFileNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int count=0;
			
			File f= new File("C:\\Users\\DELL\\eclipse-workspace\\Java_Learnings\\Textfile");
			String[] fname=f.list();
			
			for(String s1:fname) {
				
				File f1=new File(f, s1);
				
				if(f1.isDirectory()) {
					count++;
					System.out.println(s1);
				}
			
				
			}
			System.out.println("The Total No of file which is existing in the Given Directory : "+count);
	}

}
