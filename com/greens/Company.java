package com.greens;

import java.io.File;
import java.io.IOException;

public class Company {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Deppan\\Downloads\\JavaSQL\\Add\\sub\\");
		//create a new folder in a file:
		boolean a = f.mkdir();
		System.out.println(a);
		//TO create mulitple folder in directory:
		boolean b = f.mkdirs();
		System.out.println(b);
		//To create new file in particular directory:
		boolean c = f.createNewFile();
		System.out.println(c);
		
		//To check the file readable is or not:
		boolean d = f.canRead();
	    System.out.println(d);
	    //To check the file writable is or not:
	    boolean e = f.canWrite();
	    System.out.println(e);
	    //To check the file is hidden or not:
	    boolean g = f.isHidden();
	    System.out.println(g);
	    //To check the file is Excutable is or not:
	    boolean h = f.canExecute();
	    System.out.println(h);
	    
	   //To check whether the given file is file or not:
	    boolean z = f.isFile();
	    System.out.println(z);
	    //To check files present in the particular directory:
	    String[] k = f.list();
	    for (String s : k) {
	    	System.out.println(s);
	    	
	    	//To get files present in the directory with Exact location:
	    	File[] l = f.listFiles();
	    	for (int i = 0; i < l.length; i++) {
	    		System.out.println(l[i]);
				
			}
			
		}
	}

}
