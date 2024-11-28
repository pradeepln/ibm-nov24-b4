package com.ibm.training.basics;

public class FinalDemo {

	public static void main(String[] args) {
		final int i = 10;
		
//		i++;
//		
//		i += 11;
		
		System.out.println(i);

	}

}


//final 
class Base{
	//final 
	void m1() {
		
	}
}

class Child extends Base{
	@Override
	void m1() {
		
	}
}