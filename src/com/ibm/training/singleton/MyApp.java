package com.ibm.training.singleton;

public class MyApp {

	public static void main(String[] args) {
		
		final ExpensiveResource instance1 = ExpensiveResource.getInstance(); //new ExpensiveResource();
		
		instance1.doSomething();
		
				
		//at some other place
		
		ExpensiveResource ins2 = ExpensiveResource.getInstance(); // new ExpensiveResource();
		
		ins2.doSomething();
//		ExpensiveResource.instance = null;
	}

}
