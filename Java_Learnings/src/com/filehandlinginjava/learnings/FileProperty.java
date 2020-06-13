package com.filehandlinginjava.learnings;

import java.io.File;

public class FileProperty {
	//Displaying the file property
	
	public static void main(String[] args) {
		// accept file name or directory name through command line args
	//	String fname=args[0];
		
		//pass the file or directory name to file object
		File f = new File("C:\\Users\\DELL\\Documents\\sele.txt");
		
		//apply File class method on File object
		System.out.println("File Name : "+f.getName());
		System.out.println("Path: " +f.getPath());
		System.out.println("Absolute path: "+f.getAbsolutePath());
		System.out.println("Parents : "+f.getParent());
		System.out.println("Exists : "+f.exists());
		
		if(f.exists()) {
		System.out.println("Is writeable : "+f.canWrite());
		System.out.println("Is readable : "+f.canRead());
		System.out.println("Is a directory :"+f.isDirectory());
		System.out.println("File size in bytes :"+f.length());
		
		}
		
	}

}
