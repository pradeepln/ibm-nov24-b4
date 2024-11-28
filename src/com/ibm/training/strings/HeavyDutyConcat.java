package com.ibm.training.strings;

public class HeavyDutyConcat {

	public static void main(String[] args) {
		String[] words = {"this","is","a","series","of","strange","words","like","kappa","gamma","and","zebra"};
		
		String sentence = formASentence(words);
		System.out.println(sentence);
	}

	private static String formASentence(String[] words) {
		StringBuilder buf = new StringBuilder();
		for(int i = 0 ; i < words.length ; i++) {
			buf.append(words[i]);
			buf.append(" ");
		}
		return buf.toString();
	}

//	private static String formASentence(String[] words) {
//		String sentence = "";
//		for(int i = 0 ; i < words.length ; i++) {
//			sentence += words[i] + " "; //sentence = sentence.concat(words[i].concat(" "));
//		}
//		return sentence;
//	}

}
