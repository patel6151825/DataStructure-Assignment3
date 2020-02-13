package com.johnabbott.recursion.model;

public class Task2 {

	public int count11(String str) {
		//exit condition
		if (str.length() < 2) {
			return 0;
		}
		
		//check the count
		if(str.substring(0, 2).equals("11")) {
			return 1 + count11(str.substring(2));
		}
		
		//if it wasn't 11, we removed the first character
		return count11(str.substring(1));
	}
}
