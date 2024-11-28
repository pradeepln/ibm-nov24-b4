package com.ibm.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {
		// Literal simply means hard-coded value

		int i = 100;
		boolean awake = true;
		char firstEng = 'A';
		
		String name = "Pradeep";
		
		long l = 100;
		float f = 23.1f;
		double d = 100;
		
		m1(42.0);
		
		//special literal
		//char c = 97;
		char c = '\u0911';
		System.out.println(c);
		
		int hexVal = 0xa911;
		System.out.println(hexVal);
		
		int octVal = 0673;
		System.out.println(octVal);
	}
	
	public static void m1(int x) {
		//logic1
	}
	
	public static void m1(long x) {
		//logic2
	}
	
	public static void m1(float x) {
		//logic3
	}
	
	public static void m1(double x) {
		//logic4
	}

}
