package com.greens;

import java.util.Scanner;

public class EmpDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Employee name");
		String name = s.nextLine();
		System.out.println("Employee name:"+name);
		System.out.println("Enter the Employee Id");
		String Id = s.nextLine();
		System.out.println("Employee Id:"+Id);
		System.out.println("Enter the Employee Phno");
		long phno = s.nextLong();
		System.out.println("Employee phno:"+phno);
	}

}
