package com.ibm.training.threads;

public interface Stack {

	void push(Object anElement);
	Object pop();
	
	default int size() {
		return -1;
	}
}
