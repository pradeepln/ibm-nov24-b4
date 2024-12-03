package com.ibm.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] wordsArr = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		List<String> words = Arrays.asList(wordsArr);
		
		//words.stream().forEach(s -> System.out.println("  "+s));

		//words.stream().forEach(System.out::println);
		
		List<String> excitingWords = words.stream().map(s -> s+"!").toList();
				
		List<String> eyeWords = words
								.stream()
								.map(s -> s.replace("i", "eye"))
								.toList();
		
		List<String> upperCaseWords = words.stream().map(s -> s.toUpperCase()).toList();

		System.out.println(excitingWords + "\n" + eyeWords + "\n" + upperCaseWords);
		System.out.println("_______________________________________________________________________");
		List<String> shortWords = words
									.stream()
									.filter(s -> s.length() < 4)
									.collect(Collectors.toList());
		List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).toList();
		List<String> evenLengthWords = words.stream().filter(s -> (s.length() % 2) == 0).toList();
		System.out.println(shortWords + "\n" + wordsWithB + "\n" + evenLengthWords);
		
		System.out.println("_____________________________________________________________________");
		
		words
			.stream()
			.filter(s -> s.length() > 1)
			.map(s -> s.length())
			.map(i -> Math.sin(i))
			.map(d -> "hello "+d)
			.forEach(System.out::println);

	}

}
