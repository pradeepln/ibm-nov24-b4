package com.ibm.training.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormats {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		String basicIsoDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("basic iso : "+basicIsoDate);
		
		String isoDate = now.format(DateTimeFormatter.ISO_DATE);
		System.out.println("iso date: "+isoDate);
		
		String isoDateTime = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("iso date time : "+isoDateTime);
		
		String indianDate = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("India format: "+indianDate);
		
		String custom = now.format(DateTimeFormatter.ofPattern("E dd LLL yyyy"));
		System.out.println("Custom format: "+custom);

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a date(dd/MM/yyyy): ");
		String input = kb.nextLine();
		
		LocalDate aDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("The date is: "+aDate);
		
	}

}
