package org.emoflon.flight.model.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookingGenerator {
	/**
	 * output path
	 */
	static String filePath = "src\\org\\emoflon\\flight\\model\\examples\\simple.bookings";
	/**
	 * output header
	 */
	static String header = "//\r\n" + "// Bookings\r\n" + "// BOOKINGNO;(TRAVEL-ID|PERSON-ID|FLIGHTID(:FLIGHTID)*)*\r\n" + "//\n";
	/**
	 * number of times the generator should be run (for following days)
	 */
	static int repeat = 7;
	/**
	 * maximum of Persons, that can travel in a group
	 */
	private static int maxGroupSize = 4;
	/**
	 * days between start of a first travel an a new one
	 */
	private static int daysBetweenTravels = 2;
	/**
	 * minimum capacity of all planes
	 */
	private static int minFlightCapacity = 215;
	/**
	 * rate of minimum plane capacity used for connecting flights
	 * (per connecting route)
	 */
	private static double connectingBookingRate = 0.1;
	/**
	 * rate of plane capacity used for direct flight
	 */
	private static double normalBookingRate = 0.75;
	/**
	 * number of bookings per day
	 */
	private static int bookingsPerDay = 4590;
	/**
	 * number of persons in the person list
	 */
	private static int personListSize = 1400;
	/**
	 * declares when looping through the person list again
	 */
	private static int loop = Math.min(bookingsPerDay * daysBetweenTravels, personListSize);
	/**
	 * person list
	 */
	private String[] personStrings = ModelParser.arrayParseFromFile(0, "simple.persons");
	/**
	 * start date for the generator
	 */
	private static long startDate = LongDateHelper.getDate(01, 01, 2020);

	public static void main(String[] args) {
		long tic = System.currentTimeMillis();
		try {
			PrintWriter pw = new PrintWriter(filePath);
			BookingGenerator bg = new BookingGenerator();

			List<String> generatedBookings = bg.generateBookings(repeat);
			pw.append(header);
			for (String s : generatedBookings) {
				System.out.println(s);
				pw.append(s + "\n");
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		long toc = System.currentTimeMillis();
		System.out.println("Finished in: " + (toc - tic) + " ms");
	}

	private List<String> generateBookings(int repeat) {
		ArrayList<String> bookings = new ArrayList<String>();
		// getting possible travels
		List<DummyFlight[]> connectingFlights = getUnnescessaryFiddlyList(0);
		List<DummyFlight[]> nonConnectingFlights = getUnnescessaryFiddlyList(1);
		
		Random ran = new Random();
		int offset = 0;
		
		for (int rep = 0; rep <= repeat; rep++) { // loop for repeating days
			String date = LongDateHelper.getStringDDMMYYYY((startDate + rep * LongDateHelper.DAYINMS));
			for (DummyFlight[] flights : connectingFlights) { // loop for connecting flights
				// string-array representation of flights in connecting travel
				String[] flightsString = new String[flights.length];
				for (int numFlights = 0; numFlights < flights.length; numFlights++)
					flightsString[numFlights] = flights[numFlights].getUUIDForDate(rep, startDate);
				int personsOnFlight = (int) (minFlightCapacity * connectingBookingRate);
				for (int person = offset; person < personsOnFlight + offset; person++) { // loop though persons
					// TODO: possibility for more than one travel a day / person
					String bookingNo = personStrings[person % loop] + date;
					int groupSize = Math.min(ran.nextInt(maxGroupSize) + 1, personsOnFlight);
					// creating travels
					DummyTravel[] travels = new DummyTravel[groupSize];
					for (int personsInBooking = 0; personsInBooking < groupSize; personsInBooking++) {
						String personString = personStrings[(person + personsInBooking) % loop];
						travels[personsInBooking] = new DummyTravel(personString, flightsString);
					}
					person += groupSize - 1; // already incremented one
					bookings.add(new DummyBooking(bookingNo, travels).toString());
				}
				offset += personsOnFlight; // increment offset for looping through persons
			}

			for (DummyFlight[] flights : nonConnectingFlights) { // loop for non-connecting flights
				// string-array representation of the flight
				String[] flightsString = { flights[0].getUUIDForDate(rep, startDate) };
				int personsOnFlight = (int) (flights[0].capacity * normalBookingRate);
				for (int person = offset; person < personsOnFlight + offset; person++) { // loop though persons
					// TODO: possibility for more than one travel a day / person
					String bookingNo = personStrings[person % loop] + date;
					int groupSize = Math.min(ran.nextInt(maxGroupSize) + 1, personsOnFlight);
					// creating travels
					DummyTravel[] travels = new DummyTravel[groupSize];
					for (int personsInBooking = 0; personsInBooking < groupSize; personsInBooking++) {
						String personString = personStrings[(person + personsInBooking) % loop];
						travels[personsInBooking] = new DummyTravel(personString, flightsString);
					}
					person += groupSize - 1; // already incremented one
					bookings.add(new DummyBooking(bookingNo, travels).toString());
				}
				offset += personsOnFlight; // increment offset for looping through persons
			}
		}
		return bookings;
	}

	/**
	 * @param switcher declares whether the output should be connecting flights (0) or non-connecting flights (1)
	 * @return list including arrays of flights defining possible travels
	 */
	private List<DummyFlight[]> getUnnescessaryFiddlyList(int switcher) {
		ArrayList<DummyFlight[]> flightCombos = new ArrayList<DummyFlight[]>();

		if (switcher == 0) {
			// ConnectingFlights
			DummyFlight[] LH630EK414 = { new DummyFlight("LH630", 221, 0), new DummyFlight("EK414", 364, 0) };
			DummyFlight[] EK44EK416 = { new DummyFlight("EK44", 364, 0), new DummyFlight("EK416", 489, 0) };
			DummyFlight[] EK46EK414 = { new DummyFlight("EK46", 489, 0), new DummyFlight("EK414", 489, 0) };
			DummyFlight[] EK48EK412 = { new DummyFlight("EK48", 489, 0), new DummyFlight("EK412", 489, 1) };
			flightCombos.add(LH630EK414);
			flightCombos.add(EK44EK416);
			flightCombos.add(EK46EK414);
			flightCombos.add(EK48EK412);
			DummyFlight[] EK417LH631 = { new DummyFlight("EK417", 489, 0), new DummyFlight("LH631", 221, 0) };
			DummyFlight[] EK415EK49 = { new DummyFlight("EK415", 489, 0), new DummyFlight("EK49", 489, 1) };
			DummyFlight[] EK413EK47 = { new DummyFlight("EK413", 489, 0), new DummyFlight("EK47", 489, 1) };
			flightCombos.add(EK417LH631);
			flightCombos.add(EK415EK49);
			flightCombos.add(EK413EK47);
		} else
		// Non connecting Flights
		{
			DummyFlight[] EK44 = { new DummyFlight("EK44", 364, 0) };
			DummyFlight[] EK45 = { new DummyFlight("EK45", 364, 0) };
			DummyFlight[] EK46 = { new DummyFlight("EK46", 489, 0) };
			DummyFlight[] EK47 = { new DummyFlight("EK47", 489, 0) };
			DummyFlight[] EK48 = { new DummyFlight("EK48", 489, 0) };
			DummyFlight[] EK49 = { new DummyFlight("EK49", 489, 0) };
			DummyFlight[] LH630 = { new DummyFlight("LH630", 221, 0) };
			DummyFlight[] LH631 = { new DummyFlight("LH631", 221, 0) };
			flightCombos.add(EK44);
			flightCombos.add(EK45);
			flightCombos.add(EK46);
			flightCombos.add(EK47);
			flightCombos.add(EK48);
			flightCombos.add(EK49);
			flightCombos.add(LH630);
			flightCombos.add(LH631);
			DummyFlight[] EK412 = { new DummyFlight("EK412", 489, 0) };
			DummyFlight[] EK413 = { new DummyFlight("EK413", 489, 0) };
			DummyFlight[] EK414 = { new DummyFlight("EK414", 364, 0) };
			DummyFlight[] EK415 = { new DummyFlight("EK415", 489, 0) };
			DummyFlight[] EK416 = { new DummyFlight("EK416", 489, 0) };
			DummyFlight[] EK417 = { new DummyFlight("EK417", 489, 0) };
			flightCombos.add(EK412);
			flightCombos.add(EK413);
			flightCombos.add(EK414);
			flightCombos.add(EK415);
			flightCombos.add(EK416);
			flightCombos.add(EK417);
		}
		return flightCombos;
	}

	class DummyFlight {
		/**
		 * routeID for this flight
		 */
		private String routeID;
		/**
		 * minimum capacity for planes performing this flight
		 */
		int capacity;
		/**
		 * offset of days to the given date of this flight
		 */
		int offset;

		public DummyFlight(String routeID, int capacity, int offset) {
			this.routeID = routeID;
			this.capacity = capacity;
			this.offset = offset;
		}

		/**
		 * @param repeat since startDate
		 * @param startDate in ms (see Java.Date)
		 * @return String including routeID and Date
		 */
		public String getUUIDForDate(int repeat, long startDate) {
			long time = startDate + (repeat + offset) * LongDateHelper.DAYINMS;
			return routeID + LongDateHelper.getStringDDMMYYYY(time);
		}

	}

	class DummyBooking {
		/**
		 * unique booking ID
		 */
		String ID;
		/**
		 * travels in booking
		 */
		DummyTravel[] travels;

		public DummyBooking(String ID, DummyTravel[] travels) {
			this.ID = ID;
			this.travels = travels;
		}
		/**
		 * output booking as string in parse-able format
		 */
		public String toString() {
			String s = ID + ";";
			for (int i = 0; i < travels.length; i++) {
				s += travels[i];
				if (i < travels.length - 1)
					s += ",";
			}
			return s;
		}
	}

	class DummyTravel {
		/**
		 * unique travelID
		 */
		String travelID;
		/**
		 * personID performing this travel
		 */
		final String personID;
		/**
		 * flights included in this travel
		 */
		final String[] flights;

		public DummyTravel(String personID, String[] flights) {
			this.personID = personID;
			travelID = personID;
			this.flights = flights;
			for (String flight : flights)
				travelID += flight;
		}
		/**
		 * output travel as string in parse-able format
		 */
		public String toString() {
			String s = travelID + "|" + personID + "|";
			for (int i = 0; i < flights.length; i++) {
				s += flights[i];
				if (i < flights.length - 1)
					s += ":";
			}
			return s;
		}
	}
}