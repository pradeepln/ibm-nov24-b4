package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltinFuncIntfDemo {
	
	/*
	 * public static List<String> allMatches(List<String> candidates,
	 * Predicate<String> condition){ List<String> matches = new ArrayList<>();
	 * for(String aCandidate : candidates) { if(condition.test(aCandidate)) {
	 * matches.add(aCandidate); } } return matches; }
	 */

	public static <T> List<T> allMatches(List<T> candidates, Predicate<T> condition){
		List<T> matches = new ArrayList<>();
		for(T aCandidate : candidates) {
			if(condition.test(aCandidate)) {
				matches.add(aCandidate);
			}
		}
		return matches;
	}
	
	/*
	 * public static List<String> transformedList(List<String>
	 * input,Function<String,String> transformationLogic){ List<String>
	 * tranformedValues = new ArrayList<>(); for(String aValue : input) { String
	 * transformedValue = transformationLogic.apply(aValue);
	 * tranformedValues.add(transformedValue); } return tranformedValues; }
	 */
	
	public static <T,R> List<R> transformedList(List<T> input,Function<T,R> transformationLogic){
		List<R> tranformedValues = new ArrayList<>();
		for(T aValue : input) {
			R transformedValue  = transformationLogic.apply(aValue);
			tranformedValues.add(transformedValue);
		}
		return tranformedValues;
	}
	
	public static void main(String[] args) {
		String[] wordsArr = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		List<String> words = Arrays.asList(wordsArr);
		
		List<String> shortWords = allMatches(words, s -> s.length() < 4);
		List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
		List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
		System.out.println(shortWords + "\n" + wordsWithB + "\n" + evenLengthWords);

		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = allMatches(nums, n -> n>500);
		System.out.println(bigNums);
		
		System.out.println("____________________________________________");

		List<String> excitingWords = transformedList(words, s -> s + "!");
		List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
		List<String> upperCaseWords = transformedList(words, s -> s.toUpperCase());

		System.out.println(excitingWords + "\n" + eyeWords + "\n" + upperCaseWords);
		
		List<Integer> wordLengths = transformedList(words, s -> s.length());
		System.out.println(wordLengths);

	}

}
