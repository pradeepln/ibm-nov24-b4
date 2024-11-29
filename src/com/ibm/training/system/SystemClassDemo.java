package com.ibm.training.system;

import java.io.IOException;
import java.util.Scanner;

public class SystemClassDemo {

	public static void main(String[] args) throws IOException {
		System.out.print("hello ");
		System.out.print("world");
		System.out.println("again");

		System.err.println(" here we go again....");
		
		System.out.println("Enter anything from kb: ");
		
//		int intVal = System.in.read();
//		System.out.println(intVal);
		
		Scanner kb = new Scanner(System.in);
		String line = kb.nextLine();
		
		System.out.println(line);
		
		System.out.println(System.currentTimeMillis());
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperties());
		
		
	}

}
