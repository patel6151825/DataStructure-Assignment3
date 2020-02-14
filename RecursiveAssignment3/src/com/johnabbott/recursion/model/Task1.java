package com.johnabbott.recursion.model;

public class Task1 {

	public int[] countSubstringabcAndaba(String str, int[] counterArray, int count1, int count2) {

		counterArray[0] = count1;
		counterArray[1] = count2;
		// exit condition
		if (str.length() < 3) {
			return counterArray;
		} else {
			// checking the count for substring abc
			if (str.substring(0, 3).equals("abc")) {
				++count1;
				countSubstringabcAndaba(str.substring(2), counterArray, count1, count2);
			}
			// checking the count for substring aba
			else if (str.substring(0, 3).equals("aba")) {
				++count2;
				countSubstringabcAndaba(str.substring(1), counterArray, count1, count2);
			}
			// if it is not abc or aba, removed the first character
			else {
				countSubstringabcAndaba(str.substring(1), counterArray, count1, count2);
			}
			return counterArray;
		}

	}
}
