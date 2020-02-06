package org.emoflon.flight.model.util;

import java.util.Calendar;
import java.util.Date;

public class LongDateHelper {
	/**
	 * one second in milliseconds
	 */
	public static long SECONDSINMS = 1000;
	/**
	 * one minute in milliseconds
	 */
	public static long MINUTEINMS = 60000;
	/**
	 * one hour in milliseconds
	 */
	public static long HOURINMS = 3600000;
	/**
	 * one day in milliseconds
	 */
	public static long DAYINMS = 86400000;
	/**
	 * one week in milliseconds
	 */
	public static long WEEKINMS = 604800000;
	/**
	 * @param time in milliseconds (see Java-Date)
	 * @return string in format DDMMYYY, while DD represents the current day of the month (e.g. '01'), MM represents the month (e.g. 'Feb'), and YYYY the current year (e.g. '2020')
	 */
	public static String getStringDDMMYYYY(long time) {
		Date date = new Date(time);
		String dateString = date.toString();
		String[] splitDate = dateString.split(" ");
		return splitDate[2] + splitDate[1] + splitDate[5];
	}
	/**
	 * @param day of the date (e.g. '01')
	 * @param month of the date (e.g. '1'), while January is 0
	 * @param year of the date (e.g. '2020')
	 * @return String to the given date
	 */
	public static String getStringDDMMYYYY(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day, 0, 0);
		return getStringDDMMYYYY(cal.getTimeInMillis());
	}
	/**
	 * @param day of the date (e.g. '01')
	 * @param month of the date (e.g. '1'), while January is 0
	 * @param year of the date (e.g. '2020')
	 * @param hour of the date (e.g. '12')
	 * @param min of the date (e.g. '30')
	 * @return time in milliseconds (see Java-Date)
	 */
	public static long getDate(int day, int month, int year, int hour, int min) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day, hour, min,0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}
	/**
	 * @param day of the date (e.g. '01')
	 * @param month of the date (e.g. '1'), while January is 0
	 * @param year of the date (e.g. '2020')
	 * @return time in milliseconds (see Java-Date)
	 */
	public static long getDate(int day, int month, int year) {
		return getDate(day, month, year, 0, 0);
	}
	public static long getTimeInMs(int dayOfWeek, int hour, int min) {
		return dayOfWeek*DAYINMS+hour*HOURINMS+min*MINUTEINMS;
	}
	public static long getTimeInMs(int hour, int min) {
		return getTimeInMs(0, hour, min);
	}
}
