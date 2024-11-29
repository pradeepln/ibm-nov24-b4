package com.ibm.training.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		mapOps();

	}

	private static void mapOps() {
		Map<String,Integer> runsMap = new HashMap<>();
		runsMap.put("rahul", 75);
		runsMap.put("jaiswal", 160);
		runsMap.put("virat", 11);
		runsMap.put("pant", 35);
		runsMap.put("bumrah", 31);
		runsMap.put("virat", 12);
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a batsman name:");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(runsMap.containsKey(input)) {
				int runs = runsMap.get(input);
				System.out.println(input + " has scored " + runs +" runs.");
			}else {
				System.out.println("No data (mapping) for "+input);
			}
		}
		System.out.println("______________________________________");
		Collection<String> allKeys = runsMap.keySet();
		for(String aKey : allKeys) {
			System.out.println(aKey + " --------------> " + runsMap.get(aKey));
		}
	}

}
