package com.ibm.training.basics;

public class UnaryBinaryTernaryOperators {

	public static void main(String[] args) {
		
		int i = 10;
		
		//++i; //===> i = i + 1;
		
		int j = ++i;
		
		System.out.println(j);
		
		
		//j += i; //====> j = j + i;
		
		
		
		System.out.println(j);
		
		String evenOdd = (j % 2 == 0) ? "Even" : "Odd";
		
		System.out.println(evenOdd);

	}

}
