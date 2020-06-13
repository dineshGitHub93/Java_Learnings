package com.filehandlinginjava.learnings;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("samplefile.txt");
		
		//To check whether the file is created or not
		System.out.println(f.exists());
		
		//Create a new file
		f.createNewFile();
		
		//To check whether the file is created or not
		System.out.println(f.exists());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		
		File f1 = new File("Textfile");
		
		System.out.println(f1.exists());
		
		f1.mkdir();
		
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		
		
		
		
		
		
	}

}
