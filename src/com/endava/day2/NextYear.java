package com.endava.day2;
import java.util.Calendar;
public class NextYear {
public static void main(String[] args) {
	printNext20Year();
}
public static void printNext20Year() {
	Calendar calendar = Calendar.getInstance();
	int currentYear = calendar.get(Calendar.YEAR);
	int leapYearsFound = currentYear - 20;
	while (leapYearsFound<20){
		if(isLeapYear(leapYearsFound))
		{
			System.out.println(leapYearsFound);
			leapYearsFound++;
		}
		leapYearsFound++;
	}
}
public static boolean isLeapYear(int year) {
	if(year%4 !=0)
	{
		return false;
	}
	else if (year%100 !=0)
	{
		return true;
	}
	else return year%400 == 0;
}
}
