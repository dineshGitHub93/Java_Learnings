package com.filehandlinginjava.learnings;

import java.io.File;
import java.io.IOException;

public class FileCreationsAll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		int count=0;
				// Create a file object for creation of new directory
			 	File a = new File("DemoFolder");
			 	//Check whether the file is already exist
			 	System.out.println("Is directory already Created: "+a.exists());
			 	//Create a new file
			 	a.mkdir();
			 	// Check whether the new directory is created 
			 	System.out.println("Is directory already created:"+a.exists());
			 	
			 	// getting AbsolutePath of Cerated directory
			 	String path=a.getAbsolutePath();
			 	// Create a new text file in created a directory by using fileConstrutor
			 	File a1 = new File(path, "Demo2.txt");
			 	a1.createNewFile();
			 	System.out.println("Verify File Created: "+a1.exists());
			 	
			 	File a3=new File("C:\\Users\\DELL\\eclipse-workspace\\Java_Learnings\\DemoFolder");
			 	String[] s=a3.list();
			 	
			 	for(String s1:s) {
			 		
			 		File f2= new File(a3, s1);
			 		
			 		if(f2.isDirectory()) {
			 			count++;
			 			System.out.println(s1);
			 		}
			 	}
			 	System.out.println("No of available in given File "+count);
			 	
			 	

	}

}
