package com.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIo {

	public static void main(String[] args) throws FileNotFoundException 
	{
		File f1 = new File("/home/admin123/Desktop/numb.txt");
		BufferedReader br = new BufferedReader(new FileReader(f1));
	    int line=0;
	    String sum ="";
	    try {
			while((line = br.read())!= -1)
				System.out.println(line);
				 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	System.out.println(line);
	    System.out.println(sum);

	}

}
