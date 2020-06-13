package com.filehandlinginjava.learnings;

import java.io.IOException;


public class FileWriter {

	 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		java.io.FileWriter fw = new java.io.FileWriter("sample1.txt", true);
		fw.write(100);
		fw.write("inesh \n Software Solutions");
		fw.write("\n");
		char[] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		
		

	}

}
