package org.zilker.vigneshb;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HtmlTagsRemoval {

	public static void main(String[] args) {
		String tagPattern = "\\<[a-z\\/]*\\>";
		String inputString;
		Logger logger = Logger.getLogger(HtmlTagsRemoval.class.getName());
		Scanner scan = new Scanner(System.in);
		logger.log(Level.INFO, "enter the string");
		inputString = scan.nextLine();
		logger.log(Level.INFO, "the replaced string is " + inputString.replaceAll(tagPattern, ""));
	}
}
