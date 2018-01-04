package org.zilker.vigneshb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompareDates {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(CompareDates.class.getName());
		Scanner scan = new Scanner(System.in);
		String date1=null, date2;
		Date d1 = null, d2;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");// to parse dates from the string
		logger.log(Level.INFO, "enter the two dates in the form dd-MM-yyyy");
		sdf.setLenient(false);
		try {
			date1 = scan.nextLine();

			d1 = sdf.parse(date1);
		} catch (Exception e) {
			logger.info("Enter the date 1 properly");
		}
		try {
			date2 = scan.nextLine();
			d2 = sdf.parse(date2);
			if (d1.compareTo(d2) < 0)
				logger.log(Level.INFO, date1+" is before "+date2);
			if (d1.compareTo(d2) > 0)
				logger.log(Level.INFO, date2+" is before "+date1);
			if (d1.compareTo(d2) == 0)
				logger.log(Level.INFO, "both are same dates");
		} catch (Exception e) {
			logger.info("Enter the date 2 properly");
		}

	}
}
