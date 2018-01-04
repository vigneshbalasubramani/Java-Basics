package org.zilker.vigneshb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DayOfTheWeek {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(DayOfTheWeek.class.getName());
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");// To extract date from string
		String date1;
		DateFormat dateFormat = new SimpleDateFormat("EEEE");// gets day of the week
		SimpleDateFormat sdf2 = new SimpleDateFormat("E yyyy-MM-dd hh:mm:ss aa z");// gets time in UTC time zone
		sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
		logger.log(Level.INFO, "enter the DOB in the form dd-MM-yyyy to find the day ");
		date1 = scan.next();
		sdf.setLenient(false);
		try {
			Date d1 = sdf.parse(date1);
			logger.log(Level.INFO, "the day of the week is " + dateFormat.format(d1));
			logger.log(Level.INFO, "In detail ,it can be also shown as " + sdf2.format(d1));
		} catch (Exception e) {
			logger.log(Level.INFO, "Enter the date properly");
		}
	}

}
