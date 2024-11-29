package com.ibm.training.singleton;

import java.sql.Connection;

public class ExpensiveResource {
	
	private static ExpensiveResource instance;
	
	//connects to some external paid service , the more the number of cons the more $$ it will cost
	Connection c;
	
	private ExpensiveResource() {
		//c = establish con to paid service
	}
	
	
	//business ops
	public void doSomething() {
		//c.makeExternalCalls
	}

	
	public static ExpensiveResource getInstance() {
		if(instance == null) {
			instance = new ExpensiveResource();
		}
		return instance;
	}
}
