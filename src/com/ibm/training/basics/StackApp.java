package com.ibm.training.basics;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		Stack stackObj = new FixedArrayStack(10);
		
		//Stack stackObj = new DynStack();
		
		u.fill(stackObj);

	}

}
