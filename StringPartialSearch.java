package org.zilker.vigneshb;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringPartialSearch {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(StringPartialSearch.class.getName());
		String[] strngs = new String[20];
		int flag = 0;
		String keyString;
		Scanner scan = new Scanner(System.in);
		logger.log(Level.INFO, "enter the size of string array");
		int arraySize = scan.nextInt();
		logger.log(Level.INFO, "enter the strings");
		for (int count = 0; count < arraySize; count++) { // getting the array of strings
			strngs[count] = scan.next();
		}
		logger.log(Level.INFO, "Enter the key string to search");
		keyString = scan.next(); // getting the string to search
		for (int count = 0; count < arraySize; count++) { // checking key string in the array
			if (strngs[count].contains(keyString)) {
				flag++;
				logger.log(Level.INFO, "The keyString is partially present in " + strngs[count]);
			}
		}
		if (flag == 0)
			logger.log(Level.INFO, "The key string is not even partially present in the array");
		else
			logger.info("The key string is present in " + flag + " instances");
	}
}
