package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.basics.ChemicalElement;

public class SortDemo {

	public static void main(String[] args) {
		//simpleSortOfStringArray();
		//simpleSortOfIntegerArray();
		//simpleSortOfStringList();
		//sortUserDefinedList();
		//sortOfStringListOnStrLength();
		sortOfStringListOnStrLengthUsingAnon();
	}

	private static void sortOfStringListOnStrLengthUsingAnon() {
		String[] words = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		Collections.sort(wordList,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		} );
		
		System.out.println(wordList);
	}
	
	
	private static void sortOfStringListOnStrLength() {
		String[] words = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		Collections.sort(wordList,new StringLengthComparator());		
		
		System.out.println(wordList);
	}
	
	private static void sortUserDefinedList() {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		
		List<ChemicalElement> cList = new ArrayList<>();
		cList.add(o);cList.add(ga);cList.add(h);cList.add(k);
		System.out.println(cList);
		
		Collections.sort(cList);
		
		System.out.println(cList);
	}

	private static void simpleSortOfStringList() {
		String[] words = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		Collections.sort(wordList);		
		System.out.println(wordList);
	}

	private static void simpleSortOfIntegerArray() {
		Integer[] nums = {27,31,24,17,67,88};
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void simpleSortOfStringArray() {
		String[] words = {"this","is","a","series","of","strange","unintuitive","words","like","kappa","gamma","and","zebra"};
		System.out.println(Arrays.toString(words));
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}

}
