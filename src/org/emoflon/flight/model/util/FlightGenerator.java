package org.emoflon.flight.model.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FlightGenerator {
	/**
	 * output path
	 */
	static String filePath = "src\\org\\emoflon\\flight\\model\\examples\\simple.flights";
	/**
	 * output header
	 */
	static String header = "//\r\n" + "// Flights\r\n"
			+ "// Flight-ID;Route-ID;Departure(in ms);Arrival(in ms);Plane-ID\r\n" + "//\n";
	/**
	 * number of times the generator should be run (for following days)
	 */
	static int repeat = 14;

	public static void main(String[] args) {
		long tic = System.currentTimeMillis();
		FlightGenerator fg = new FlightGenerator();
		ArrayList<String> generatedFlights = fg.generateFlights(repeat);
		try {
			PrintWriter pw = new PrintWriter(filePath);
			pw.append(header);
			for (String s : generatedFlights) {
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

	/**
	 * @param repeat
	 * @return
	 */
	private ArrayList<String> generateFlights(int repeat) {
		ArrayList<String> flightsString = new ArrayList<String>();

		// all flights with planes in DummyFlight wrapper
		String[] planesLH630LH631 = { "D-AIKO", "D-AIKL", "D-AIKP", "D-AIKK", "D-AIKF" };
		DummyFlight LH630 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 12, 15),
				LongDateHelper.getDate(01, 01, 2020, 18, 45), LongDateHelper.DAYINMS, "LH630", planesLH630LH631);
		DummyFlight LH631 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 21, 50),
				LongDateHelper.getDate(02, 01, 2020, 5, 5), LongDateHelper.DAYINMS, "LH631", planesLH630LH631);
		String[] planesEK44EK45 = { "A6-EPJ", "A6-EQN", "A6-EQI", "A6-EQP" };
		DummyFlight EK44 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 8, 40),
				LongDateHelper.getDate(01, 01, 2020, 15, 00), LongDateHelper.DAYINMS, "EK44", planesEK44EK45);
		DummyFlight EK45 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 23, 20),
				LongDateHelper.getDate(02, 01, 2020, 6, 35), LongDateHelper.DAYINMS, "EK45", planesEK44EK45);
		String[] planesEK46EK47 = { "A6-EEY", "A6-EDK", "A6-EOJ", "A6-EOU", "A6-EDQ", "A6-EDL", "A6-EUB", "A6-EED" };
		DummyFlight EK46 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 13, 30),
				LongDateHelper.getDate(01, 01, 2020, 19, 45), LongDateHelper.DAYINMS, "EK46", planesEK46EK47);
		DummyFlight EK47 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 4, 40),
				LongDateHelper.getDate(01, 01, 2020, 11, 45), LongDateHelper.DAYINMS, "EK47", planesEK46EK47);
		String[] planesEK48EK49 = { "A6-EOB", "A6-EVK", "A6-EEX", "A6-EUC", "A6-EDU", "A6-EOW", "A6-EOI", "A6-EDG" };
		DummyFlight EK48 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 19, 30),
				LongDateHelper.getDate(02, 01, 2020, 1, 55), LongDateHelper.DAYINMS, "EK48", planesEK48EK49);
		DummyFlight EK49 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 10, 35),
				LongDateHelper.getDate(02, 01, 2020, 17, 40), LongDateHelper.DAYINMS, "EK49", planesEK48EK49);
		String[] planesEK412EK413 = { "A6-EVE", "A6-EUF", "A6-EUK", "A6-EUG", "A6-EUL", "A6-EUJ" };
		DummyFlight EK412 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 6, 15),
				LongDateHelper.getDate(01, 01, 2020, 20, 0), LongDateHelper.DAYINMS, "EK412", planesEK412EK413);
		DummyFlight EK413 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 10, 10),
				LongDateHelper.getDate(02, 01, 2020, 0, 40), LongDateHelper.DAYINMS, "EK413", planesEK412EK413);
		String[] planesEK414EK415 = { "A6-EUU", "A6-EVI", "A6-EUS", "A6-EVJ", "A6-EUS", "A6-EUR", "A6-EVH" };
		DummyFlight EK414 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 22, 00),
				LongDateHelper.getDate(02, 01, 2020, 11, 30), LongDateHelper.DAYINMS, "EK414", planesEK414EK415);
		DummyFlight EK415 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 19, 00),
				LongDateHelper.getDate(02, 01, 2020, 9, 10), LongDateHelper.DAYINMS, "EK415", planesEK414EK415);
		String[] planesEK416EK417 = { "A6-EEO", "A6-EEG", "A6-EDP", "A6-EEF", "A6-EEG", "A6-EEQ", "A6-EEH", "A6-EON",
				"A6-EOE", "A6-EDZ" };
		DummyFlight EK416 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 18, 50),
				LongDateHelper.getDate(02, 01, 2020, 8, 40), LongDateHelper.DAYINMS, "EK416", planesEK416EK417);
		DummyFlight EK417 = new DummyFlight(LongDateHelper.getDate(01, 01, 2020, 5, 15),
				LongDateHelper.getDate(01, 01, 2020, 19, 15), LongDateHelper.DAYINMS, "EK417", planesEK416EK417);

		DummyFlight[] dummyFlightsStart = { LH630, EK44, EK46, EK48, EK412, EK414, EK416 };
		DummyFlight[] dummyFlightsBack = { LH631, EK45, EK47, EK49, EK413, EK415, EK417 };

		for (int r = 0; r < repeat; r++) { // loop for repeat
			for (DummyFlight flight : dummyFlightsStart) { // loop through flights
				flightsString.add(flight.createString(r));
			}
			for (DummyFlight flight : dummyFlightsBack) { // loop through back
				flightsString.add(flight.createStringBack(r));
			}
		}

		return flightsString;
	}

	class DummyFlight {
		/**
		 * starting departure of flight
		 */
		long startDeparture;
		/**
		 * starting arrival of flight
		 */
		long startArrival;
		/**
		 * repeating rate of flight
		 */
		long repeatRate;
		/**
		 * routeID of flight
		 */
		String routeID;
		/**
		 * planes for flight
		 */
		String[] planes;

		public DummyFlight(long startDeparture, long startArrival, long repeatRate, String routeID, String[] planes) {
			super();
			this.startDeparture = startDeparture;
			this.startArrival = startArrival;
			this.repeatRate = repeatRate;
			this.routeID = routeID;
			this.planes = planes;
		}

		/**
		 * @param repeat times since start
		 * @return unique ID for flight with routeID and date
		 */
		private String createUID(int repeat) {
			return routeID + LongDateHelper.getStringDDMMYYYY(getRepeatedDepartureTime(repeat));
		}

		/**
		 * @param repeat times since start
		 * @return departure for repeat-times flight since start
		 */
		private long getRepeatedDepartureTime(int repeat) {
			return startDeparture + (repeat * repeatRate);
		}

		/**
		 * @param repeat times since start
		 * @return arrival for repeat-times flight since start
		 */
		private long getRepeatedArrivalTime(int repeat) {
			return startArrival + (repeat * repeatRate);
		}

		/**
		 * @param repeat times since start
		 * @return parse-able string representation of the flight without the plane-ID
		 */
		private String createStringWithoutPlane(int repeat) {
			return createUID(repeat) + ";" + routeID + ";" + getRepeatedDepartureTime(repeat) + ";"
					+ getRepeatedArrivalTime(repeat);
		}

		/**
		 * @param repeat     times since start
		 * @param planeIndex specifies the plane from the array of planes via the index
		 * @return parse-able string representation of the flight including the plane-ID
		 */
		public String createString(int repeat, int planeIndex) {
			return createStringWithoutPlane(repeat) + ";" + planes[planeIndex];
		}

		/**
		 * @param repeat times since start
		 * @return parse-able string representation of the flight including the plane-ID
		 */
		public String createString(int repeat) {
			return createString(repeat, repeat % planes.length);
		}

		/**
		 * @param repeat times since start
		 * @return parse-able string representation of the flight including the plane-ID
		 */
		public String createStringBack(int repeat) {
			return createString(repeat, (repeat + 1) % planes.length);
		}
	}
}
