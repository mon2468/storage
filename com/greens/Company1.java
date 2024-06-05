package com.greens;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Company1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Deppan\\Downloads\\JavaSQL\\Add\\sub\\class.txt");
		
		File f2=new File("C:\\Users\\Deppan\\Downloads\\JavaSQL\\Add\\sub\\method.txt");
		//To write the content in a file:
		FileUtils.write(f, "Automation Tester");
		//To append the content in  a file:
		FileUtils.write(f,"Manual testing",true);
		//To override the content:
		FileUtils.write(f,"	Manual testing",false);
		
		//To read the content in a file:
		List<String> readLines = FileUtils.readLines(f);
		for (String x : readLines) {
			System.out.println(x);
			//To copy the content in a file:
			FileUtils.copyFile(f, f2);
			
		}
		
	}

	
		
	} 


