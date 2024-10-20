package com.endava.day5;;

import java.text.SimpleDateFormat;
import java.util.*;

public class Event {
	public static void main(String[] args) {
		// Input data with events (as if read from a file)
		String eventsInput = "August 5, 2019 - Buy a car\n"
				+ "February 24, 2019 - Doctor appointment\n"
				+ "March 18, 2019 - Dance course\n"
				+ "September 27, 2019 - Gym\n"
				+ "January 19, 2019 - Spanish lesson\n"
				+ "August 13, 2019 - Holiday to Crete\n"
				+ "June 20, 2019 - Pick up Jim from airport\n"
				+ "April 10, 2019 - Monica's wedding\n"
				+ "July 11, 2019 - Car licence exam\n"
				+ "May 24, 2019 - Pete's birthday\n"
				+ "December 22, 2019 - Ski in Austria\n"
				+ "March 22, 2019 - Conference in UK\n"
				+ "August 6, 2019 - Maroon 5 concert\n"
				+ "November 6, 2019 - Java course\n"
				+ "August 17, 2019 - Swimming lessons\n"
				+ "September 15, 2019 - Family reunion\n"
				+ "July 15, 2019 - Go to the grocery store\n"
				+ "November 22, 2019 - Pick up the new laptop\n"
				+ "September 22, 2019 - Vote for the president\n"
				+ "June 10, 2019 - Visit Disneyland";

		// Split events into lines
		String[] events = eventsInput.split("\n");

		// A map to store events by month
		Map<String, List<String>> eventsByMonth = new TreeMap<>();

		// Parse each event
		for (String event : events) {
			// Split the event into date and description
			String[] parts = event.split(" - ");
			String datePart = parts[0].trim(); // e.g., "August 5, 2019"
			String description = parts[1].trim(); // e.g., "Buy a car"

			// Add the event to the map under the corresponding month
			eventsByMonth.computeIfAbsent(getMonth(datePart), k -> new ArrayList<>()).add(datePart + " - " + description);
		}

		// Print the events grouped by month
		for (Map.Entry<String, List<String>> entry : eventsByMonth.entrySet()) {
			String month = entry.getKey();
			System.out.println(month + ":");
			List<String> monthEvents = entry.getValue();

			// Sort events for a specific month
			monthEvents.sort((a, b) -> {
				// Compare dates by parsing them
				Date dateA = parseDate(a.split(" - ")[0]);
				Date dateB = parseDate(b.split(" - ")[0]);
				return dateA.compareTo(dateB);
			});

			// Print sorted events
			for (String monthEvent : monthEvents) {
				System.out.println(monthEvent);
			}
			System.out.println(); // add a new line for better formatting
		}
	}

	// Helper method to extract month from a date string
	private static String getMonth(String date) {
		return date.split(" ")[0]; // Extract month (e.g., "August")
	}

	// Helper method to parse date string into a Date object
	private static Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("MMMM d, yyyy").parse(dateString);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
