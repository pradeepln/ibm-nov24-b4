package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//rawArrayListOps();
		//genericListOps();
		linkedListOps();
	}
	
	
	public static void someAlgo(List<String> l) {
		
		//lots of complex stuff
		int n = 0;
		String aRandomVal = l.get(n);// random access op is O(1) in AL; O(n) in LL
		
		//lots of complex stuff
		l.add(0,"new first"); // O(n) in AL; O(1) in LL
		
		//lots of complex stuff
		l.remove(1);
		
//		System.out.println("______________ Loop 1 _______________");
//		for(int i = 0; i < l.size(); i++) {
//			String aVal = l.get(i); //don't do looping using get(i)
//			System.out.println(aVal);
//		}
		
		System.out.println("______________________");
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String aVal = it.next();
			System.out.println(aVal);
		}
		
		System.out.println("______________________"); //this loop is converted into iterator based loop bt the compiler
		for(String aVal : l) {
			System.out.println(aVal);
		}
	}

	private static void linkedListOps() {
		LinkedList<String> sList = new LinkedList<>();
		
		sList.add("shine");
		sList.add("on");
		sList.add("crazy");
		sList.add(2, "you");
		
		sList.addLast("diamond");
		
		System.out.println(sList);
		
		System.out.println("first : "+sList.getFirst());
		System.out.println("last : "+sList.getLast());
		
		someAlgo(sList);
	}



	private static void genericListOps() {
		ArrayList<Integer> iList = new ArrayList<>();
		ArrayList<String> sList = new ArrayList<>();
		
		iList.add(1233);
		Integer val = iList.get(0);
		
		sList.add("abc");
		String sVal = sList.get(0);
		
		//iList.add("234");
		//Integer iVal = (Integer) sList.get(0);
	}



	private static void rawArrayListOps() {
		ArrayList al = new ArrayList();
		
		System.out.println("Initial size: "+al.size());
		al.add("I");
		al.add("set");
		al.add("to");
		al.add("the");
		al.add(2, "fire");
		al.add("rain");
		
		System.out.println("after addition: "+al.size());
		System.out.println("Contents: \n"+al);
		al.remove(0);
		System.out.println("after remove0 \n"+al);
		al.remove("fire");
		System.out.println("after remove fire \n"+al);
		
		System.out.println("____________ loop ____________");
		for(int i = 0; i < al.size() ; i++) {
			String word = (String) al.get(i);
			System.out.println(word);
		}
		
	}

}
