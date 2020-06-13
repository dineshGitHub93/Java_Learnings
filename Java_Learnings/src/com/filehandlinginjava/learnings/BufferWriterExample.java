package com.filehandlinginjava.learnings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		/**
		 * BufferedWriter in File
		 * There two constructor in BufferedWriter
		 * BufferredWriter cannot access the file directly , whereas access through object like writer
		 * 
		 * BufferedWriter bw= new BufferedWriter(Writer w);
		 * BufferedWriter bw= new BufferedWriter(Writer w, int buffersize);
		 * 
		 * Find some valid BufferedWriter constructor on below
		 * 
		 * BufferedWriter bw = new BufferedWriter(new FileWriter("fileName.txt");
		 * BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("fileName.txt"));
		 */
		
		File dir = new File("FileRW");
		File f = new File(dir, "FileRW2.txt");
		
			BufferedWriter bw= new BufferedWriter(new FileWriter(f));
			bw.write('D');
			bw.write("inesh");
			bw.newLine();
			bw.write("DInesh", 1, 4);
			
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
