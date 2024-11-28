package com.ibm.training.exceptions;

import com.ibm.training.basics.Car;

public class BuiltinExceptionDemo {

	public static void main(String[] args) {
		System.out.println("------- In Main b4 call to m1 -------");
		
		m1();
		
		System.out.println("------- In Main after call to m1 -------");
	}

	private static void m1() {
		System.out.println("<<<<<< In m1 b4 call to m2 >>>>>>");
		
		try {
			m2();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("<<<<<< In m1 after call to m2 >>>>>>");
	}

	private static void m2() {
		int i = 0;
		int num = 42;
		int iAr[] = {1,2,3};
		Car c = null;
		System.out.println("****** In m2 b4 causing exc ******");
		
		//try {
			
			int res = num / i;
			System.out.println("*********** After AE is caused ***********");
		
		//}catch(ArithmeticException ex) {
			//System.out.println("Looks like i'm dividing by 0");
		//}
		
		
		
		
		
		
		
		//i--;
		//System.out.println(iAr[i]);
		//c.start();
		//byte[] huge = new byte[Integer.MAX_VALUE];
		
		System.out.println("****** In m2 after causing exc ******");
	}

}
