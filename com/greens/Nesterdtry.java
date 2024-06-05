package com.greens;

import graphql.org.antlr.v4.runtime.InputMismatchException;

public class Nesterdtry {
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		
		try {
			String s=null;
			System.out.println(s.charAt(1));
		
		}catch(InputMismatchException e) {
		
        System.out.println("null values");
		
	}finally {
		System.out.println("Inner Finally");
	}
		}catch(Exception e) {
			System.out.println("can't divide by zero");
		}finally {
			System.out.println("outer Finally");
		}
		System.out.println(5);
		System.out.println(6);
		}
}

