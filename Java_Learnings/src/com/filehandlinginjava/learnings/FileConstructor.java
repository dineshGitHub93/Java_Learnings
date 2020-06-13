package com.filehandlinginjava.learnings;

import java.io.File;
import java.io.IOException;

public class FileConstructor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Create a File Named with sample1.txt in current working directory
		
		File f = new File("sample1.txt");
		f.createNewFile();
		System.out.println("Is File created in path :"+f.exists());
		System.out.println("Path :"+f.getAbsolutePath());
		
		// Create a directory Named with "MyNewFolder" in current working directory and create a file named with sample1 
		//in that directory
		
		File f1 = new File("MyNewFolder");
		f1.mkdir();
		System.out.println("Is directory created :" +f1.exists());
		
		// Create a file in the created directory 
		File a = new File(f1, "sample1.txt");
		a.createNewFile();
		System.out.println("File created in the new directory :"+a.exists());
		
		String path="D:\\Desktop";
		
		File a1 = new File(path, "sample1.txt");
		a1.createNewFile();
		
	}

}
