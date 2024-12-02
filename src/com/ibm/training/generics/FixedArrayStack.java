package com.ibm.training.generics;

public class FixedArrayStack<E> implements Stack<E> {
	
	private Object[] contents;
	private int top = -1;

	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(E anElement) {
		System.out.println("Pushed into FAS "+anElement);
		contents[++top] = anElement;
	}
	
	@Override
	public E pop() {
		return (E) contents[top--];
	}
}
