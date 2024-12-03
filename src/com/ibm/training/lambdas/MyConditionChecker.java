package com.ibm.training.lambdas;

@FunctionalInterface
public interface MyConditionChecker {
	
	boolean test(String value);
	
}
