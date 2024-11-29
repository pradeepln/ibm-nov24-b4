package com.ibm.training.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your birthday (dd/MM/yyyy): ");
		String input = kb.nextLine();
		
		LocalDate birthday = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old.");
	}

}
