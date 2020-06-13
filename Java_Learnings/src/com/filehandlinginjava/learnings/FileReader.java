package com.filehandlinginjava.learnings;

import java.io.File;
import java.io.FileWriter;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Constructor 1 to pass the File name directly
			java.io.FileReader f = new java.io.FileReader("sample1.txt");
			
			// Constructor 2 to pass the File reference instead of file name
			
			// java.io.FileReader f = new java.io.FileReader(File f);
			
			/** There are 3 Methods available in file reader.
			 * int read() -> it will return unicode value of character and it read only single character at runtime
			 * 
			 * int read(char[] ch) -> perform the same function what did 1st but the differences is it will read multiple character at runtime
			 * 
			 * void close() -> Close the operation 
			 */
			
			int i =f.read();
			
			while(i !=-1){
				System.out.print((char)i);
				i=f.read();
			}
			 f.close();
			 
			 File f1 = new File("FileRW"); //--> Create a directory with named as "FileRW"in current work location  
			 f1.mkdir();
			 System.out.println("Is Directory created: "+f1.exists()); //--> To check whether the directory is created
			 
			 File f2 = new File(f1, "FileRW.txt"); // -> Create a new File named with "FileRW" in Created Directory
			 f2.createNewFile();
			 System.out.println("Is File created: "+f2.exists());//--> To check whether the file is created 
			 
			 FileWriter fw = new FileWriter(f2, true); //--> To a some data in created file
			 fw.write(100);
			 fw.write("inesh\nSoftware solutions");
			 fw.write("\n");
			 fw.write("File write and read concept");
			 fw.write("\n");
			 fw.flush();
			 fw.close();
			 java.io.FileReader fr= new java.io.FileReader(f2);
			 
			 int j =fr.read();
			 while(j !=-1) {
				 System.out.print((char)j);
				 j=fr.read();
			 }
			 fr.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
