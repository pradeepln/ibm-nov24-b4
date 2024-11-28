package com.ibm.training.basics;
//					IS A
public class Car extends Vehicle {
	
//	public Car() {
//		//super(); //added by compiler
//		System.out.println("<<<<<<<<<<<<<<in cons of Car>>>>>>>>>>>>>>>>>");
//	}
	
	@Override
	public void start() {
		System.out.println("<<<< Car starting >>>>");
	}
	
	@Override
	public void stop() {
		System.out.println("<<<< Car Stopping >>>>");
	}
	
	public void playMusic() {
		System.out.println("<<<< Playing Music... La la la >>>>");
	}

}
