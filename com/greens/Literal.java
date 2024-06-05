package com.greens;

public class Literal {
	public static void main(String[] args) {
		String s="java";
		String s1="java";
		String s2="sql";
		 
		System.out.println("Litreal String");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		String s3="java";
		String s4="java";
		String s5="sql";
		
		
		System.out.println("NonLitreal String");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		
		String s6="java";
		String s7="java";
		String s8="sql";
		String s9=s6.concat(s7);
		 
		
		System.out.println("Immutable String");
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		
		StringBuffer s10=new StringBuffer("java");
		StringBuffer s11=new StringBuffer("java");
		StringBuffer s12=new StringBuffer("sql");
		
		StringBuffer s13=s10.append(s11);
		
		
		System.out.println("mutable string");
		System.out.println(System.identityHashCode(s10));
		System.out.println(System.identityHashCode(s11));
		System.out.println(System.identityHashCode(s12));
		System.out.println(System.identityHashCode(s13));
		System.out.println(s13);
		
	}

}
