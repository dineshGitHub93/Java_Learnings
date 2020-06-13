package com.filehandlinginjava.learnings;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File dir= new File("FileRW");
		System.out.println(dir.exists());
		File f= new File(dir, "FileRW1.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f, true); //--> To a some data in created file
		 fw.write(100);
		 fw.write("inesh\nSoftware solutions");
		 fw.write("\n");
		 fw.write("File write and read concept");
		 fw.write("\n");
		 fw.flush();
		 fw.close();
		
		FileReader fr = new FileReader(f);
		
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch) {
			
			System.out.print(ch1);
		}
		 

	}

}
