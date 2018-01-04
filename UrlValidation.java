package org.zilker.vigneshb;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidation {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(UrlValidation.class.getName());
		Scanner scan = new Scanner(System.in);
		Pattern urlPattern = Pattern
				.compile("(https:|http:)//[a-z0-9.]*[\\.]([a-z0-9]{3}|[a-z0-9]{2})[%=#/[a-z0-9?]+]*");
		logger.log(Level.INFO, "enter your url");
		String strng = scan.next();
		Matcher matcher = urlPattern.matcher(strng);
		if (matcher.matches()) {
			logger.log(Level.INFO, "the given url is a valid one");
		} else
			logger.log(Level.INFO, "the given url is not a valid one");
	}
}
