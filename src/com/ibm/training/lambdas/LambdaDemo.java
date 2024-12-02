package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {

	static int stI = 42;
	int i = 100;
	
	public static void main(String[] args) {
		String[] words = {"this","is","a","series","of","strange","unintuitive","words","like","axe","kappa","gamma","and","zebra"};
		System.out.println("Before: \n" + Arrays.toString(words));
		
		//Arrays.sort(words,(String s1, String s2) -> { return s1.length() - s2.length();	});
		
		//Arrays.sort(words,(s1,s2) -> { return s1.length() - s2.length();	});
		
		//Arrays.sort(words,(s1,s2) -> s1.length() - s2.length());
		
		//Arrays.sort(words,(s1,s2) -> s2.length() - s1.length());
		
		//Arrays.sort(words,(s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
		//Arrays.sort(words,(s1,s2) -> s1.substring(0, 1).compareTo(s2.substring(0, 1)));
		
		//int localI = 10;
		//System.out.println("localI = "+localI+" , static I = "+stI);
		//int word1 = 345;
		
		/*
		 * Arrays.sort(words, (word1,word2) -> {
		 * System.out.println("localI = "+localI+" , static I = "+stI ); stI++;
		 * 
		 * if(word1.contains("e") && !word2.contains("e")) { return -1; }else
		 * if(!word1.contains("e") && word2.contains("e")) { return 1; }else { return 0;
		 * } });
		 */
		
		//Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		
		Arrays.sort(words, LambdaDemo::wordsWithEFirst);
		
		System.out.println("After: \n" + Arrays.toString(words));
	}
	
	public static int wordsWithEFirst(String word1,String word2){
		
		if(word1.contains("e") && !word2.contains("e")) {
			return -1;
		}else if(!word1.contains("e") && word2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

}
