package com.ibm.training.varargs;

public class VarArgsDemo {

	public static int sum(int... nums) {
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
		}
		return sum;
	}
	


	public static void main(String... args) {
		
		int total = sum(12,27);
		
		int total3 = sum(10,20,12);
		
		System.out.println(total3);
		System.out.println(total);
	}

}
