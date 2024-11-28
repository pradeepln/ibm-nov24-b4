package com.ibm.training.basics;

public class StackUser {
	
	public void fill(Stack s) {
		for(int i = 0; i < 10; i++) {
			s.push(i); //s.push(new Integer(i))
			System.out.println("Pushed -------------> "+i);
		}
	}

}
