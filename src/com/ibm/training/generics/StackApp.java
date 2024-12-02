package com.ibm.training.generics;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		Stack<Integer> stackObj = new FixedArrayStack<>(10);
		//stackObj.push("2323");
		stackObj.push(123);
		
		//String s = (String) stackObj.pop();
		
		int val = stackObj.pop();
		
		
		//Stack stackObj = new DynStack();
		
		u.fill(stackObj);

	}

}
