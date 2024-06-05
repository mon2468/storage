
package com.greens;

public class Trymultiplecatch {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			System.out.println(4/0);
		}catch(NullPointerException e){
			System.out.println("null  value");
		}catch (StringIndexOutOfBoundsException e){
			System.out.println("String Index out of Bounds");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of Bounds");
		}catch(IndexOutOfBoundsException e){
			System.out.println("Index out of Bounds");
		}catch(Exception e) {
			System.out.println("can't divide by zero");
			
		}finally {
			System.out.println("finallly block");
		}
		
			System.out.println(5);
			System.out.println(6);
			
		}
	}


