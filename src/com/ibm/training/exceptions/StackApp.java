package com.ibm.training.exceptions;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		Stack stackObj = new FixedArrayStack(9);
		
		//Stack stackObj = new DynStack();
		
		u.fill(stackObj);

	}

}
