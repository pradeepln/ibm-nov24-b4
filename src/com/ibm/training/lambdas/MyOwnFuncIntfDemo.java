package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyOwnFuncIntfDemo {
	
	public static List<String> selectOnlyMatchingValues(List<String> candidates, MyConditionChecker conditionLogic){
		List<String> matchingValues = new ArrayList<>();
		
		for(String aValue : candidates) {
			if(conditionLogic.test(aValue)) {
				matchingValues.add(aValue);
			}
		}
		return matchingValues;
	}

	public static void main(String[] args) {
		String[] words = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		List<String> wordList = Arrays.asList(words);
		
		List<String> bigWords = selectOnlyMatchingValues(wordList, new SixWordsOrMoreCondition());
		System.out.println(bigWords);
		
		bigWords = selectOnlyMatchingValues(wordList, s -> s.length() >= 6);
		System.out.println(bigWords);
		
		List<String> wordsWithE = selectOnlyMatchingValues(wordList, s -> s.contains("e"));
		System.out.println(wordsWithE);
	}

}

class SixWordsOrMoreCondition implements MyConditionChecker{
	@Override
	public boolean test(String value) {
		return value.length() >= 6;
	}
}