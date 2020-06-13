package com.filehandlinginjava.learnings;

import java.io.File;

public class FileCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isFileCreated;
		
		try {
			File file = new File("sampletxt.txt");
			
			isFileCreated = file.createNewFile();
			
			if(isFileCreated) {
				System.out.println("A new file has been created successfully");
			}
			else {
				System.out.println(" File Already presented in the loction ");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
