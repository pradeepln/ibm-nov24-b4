package com.ibm.training.strings;

import com.ibm.training.basics.Point;

public class StringConcatDemo {

	public static void main(String[] args) {
		String s1 = "hello ";
		String s2 = "world!";
		
		//String s3 = s1.concat(s2);
		String s3 = s1 + s2; //Compiler coverts to String s3 = s1.concat(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int i = 42;
		
		String res = i + s2; //Compiler coverts to String res = String.valueOf(i).concat(s2)
		String res2 = s1 + i;//Compiler coverts to String res2 = s2.concat(String.valueOf(i))
		
		System.out.println(res);
		System.out.println(res2);
		
		Point p = new Point(10, 20);
		System.out.println(p);
		
		String s4 = s1 + p; //Compiler coverts to String s4 = s1.concat(p.toString());
		
		System.out.println(s4);

	}

}
