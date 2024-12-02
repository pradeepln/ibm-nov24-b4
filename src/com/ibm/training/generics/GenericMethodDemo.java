package com.ibm.training.generics;

import java.util.List;

import com.ibm.training.basics.Car;

public class GenericMethodDemo {

	public static <T> T pickALuckyObject(List<T> list) {
		if(Math.random() > 0.5) {
			return list.get(0);
		}else {
			return list.get(1);
		}
	}
	
	
	public static void main(String[] args) {
		List<String> sList = List.of("hi","hello");
		List<Integer> iList = List.of(9,10);
		
		String luckyWord = pickALuckyObject(sList);
		Integer luckyNum = pickALuckyObject(iList);
		
//		Car luckyCar = (Car) pickALuckyObject(iList);
//		Integer betterNum = (Integer) pickALuckyObject(sList);
	}

}
