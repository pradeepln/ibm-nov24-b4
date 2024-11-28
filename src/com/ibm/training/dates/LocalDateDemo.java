package com.ibm.training.dates;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today:");
		displayDateDetails(today);
		System.out.println("______________________________");
		System.out.println("1 year and 8 days from Today: ");
		LocalDate anotherDay = today.plusYears(1).plusDays(8);
		displayDateDetails(anotherDay);
		System.out.println("______________________________");
		
		
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Enter day of month:");
//		int day = Integer.parseInt(kb.nextLine());
//		System.out.println("Enter month:");
//		int month = Integer.parseInt(kb.nextLine());
//		System.out.println("Enter year:");
//		int year = Integer.parseInt(kb.nextLine());
//		
//		LocalDate thatDay = LocalDate.of(year, month, day);
//		displayDateDetails(thatDay);
	}

	private static void displayDateDetails(LocalDate date) {
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
	}

}
