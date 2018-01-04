package org.zilker.vigneshb;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringSearch {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(StringSearch.class.getName());
		String[] strngs = new String[20];
		int flag = 0;
		String keyString;
		Scanner scan = new Scanner(System.in);
		logger.log(Level.INFO, "enter the size of string array");
		int arraySize = scan.nextInt();
		logger.log(Level.INFO, "enter the strings");
		for (int count = 0; count < arraySize; count++) {
			strngs[count] = scan.next();
		}
		logger.log(Level.INFO, "Enter the key string to search");
		keyString = scan.next();
		for (int count = 0; count < arraySize; count++) {
			if (strngs[count].equalsIgnoreCase(keyString))
				flag = count + 1;
		}
		if (flag == 0)
			logger.log(Level.INFO, "The key string is not present in the array");

		else {
			flag--;
			logger.log(Level.INFO, "the keystring is present in " + flag + "th term of the array");
		}
	}
}
