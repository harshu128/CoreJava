package day4.javaDates;

import java.time.*;


public class Example1 {

	public static void main(String[] args) {
		// display current date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		// display current time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		// display current date as well as time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
}
