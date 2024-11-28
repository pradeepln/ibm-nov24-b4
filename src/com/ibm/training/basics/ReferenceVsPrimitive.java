package com.ibm.training.basics;

public class ReferenceVsPrimitive {

	public static void main(String[] args) {
		//primitives 
		int answer = 42;
		
		boolean available = true;
		
		char c = 'A';
		
		//references
		StringBuffer buf = new StringBuffer();
		
		int[] nums = new int[10];
		nums[0] = 42;
		
		increment(answer);
		incrementArr(nums);
		
		System.out.println(answer);
		System.out.println(nums[0]);
	}
	
	public static void increment(int x) {
		x++;
	}
	
	public static void incrementArr(int[] iArray) {
		iArray[0]++;
	}

}
