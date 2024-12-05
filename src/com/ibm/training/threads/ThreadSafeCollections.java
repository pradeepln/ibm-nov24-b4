package com.ibm.training.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollections {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>(); // NOT thread-safe
		
		List<String> threadSafeList = Collections.synchronizedList(new ArrayList<>());
		
		ConcurrentHashMap<String, Integer> chm;

	}

}
