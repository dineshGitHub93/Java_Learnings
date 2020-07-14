package com.arraylistincollections.learnings;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.imageio.stream.FileCacheImageOutputStream;

public class ArrayListSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("One");
		alist.add("Two");
		alist.add("Three");
		alist.add("Four");
		
		try {
			FileOutputStream fos = new FileOutputStream("myFile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(alist);
			oos.close();
			fos.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println(alist);
	
		

	}

}
