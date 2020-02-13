package com.johnabbott.recursion.model;

public class Task1 {
	public int[] countSubstrings(String str) {
		int[] counter = new int[2];
		counter[0] = countSubstringabc(str);
		counter[1] = countSubstringaba(str);
		return counter;
	}

	public int countSubstringabc(String str) {

		// exit condition
		if (str.length() < 3) {
			return 0;
		}

		// checking the count for substring abc
		if (str.substring(0, 3).equals("abc")) {
			return 1 + countSubstringabc(str.substring(2));
		}

		// if it is not abc, removed the first character
		return countSubstringabc(str.substring(1));
	}

	public int countSubstringaba(String str) {

		// exit condition
		if (str.length() < 3) {
			return 0;
		}

		// checking the count for substring aba
		if (str.substring(0, 3).equals("aba")) {
			return 1 + countSubstringaba(str.substring(2));
		}

		// if it is not aba, removed the first character
		return countSubstringaba(str.substring(1));
	}
}
