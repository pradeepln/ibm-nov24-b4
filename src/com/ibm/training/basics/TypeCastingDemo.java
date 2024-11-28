package com.ibm.training.basics;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int i = 32768;

		long l = i; // implicit type cast

		short s = (short) i; // explicit type cast

		System.out.println(s);

		float f = 23.1f;

		int j = (int) f; // explicit type cast

		System.out.println(j);

		/*
		 * int x = 25; float ss = 34.2f;
		 */

	}

}
