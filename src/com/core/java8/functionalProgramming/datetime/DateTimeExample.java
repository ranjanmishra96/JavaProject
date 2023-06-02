package com.core.java8.functionalProgramming.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dateObj = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(dateObj));
		
		df = new SimpleDateFormat("HH : mm: ss");
		System.out.println(df.format(dateObj));
		
		System.out.println(Calendar.getInstance().getTime());
		
		// LocalDate 
		
		LocalDate localeDate = LocalDate.now();
		System.out.println(localeDate);
		
		// LocalTime
		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);
		
		// LocalDateTIme
		
		LocalDateTime localt = LocalDateTime.now();
		System.out.println(localt);
		
		// creating localdate
		
		LocalDate localDate = LocalDate.now();
		System.out.println();

	}

}
