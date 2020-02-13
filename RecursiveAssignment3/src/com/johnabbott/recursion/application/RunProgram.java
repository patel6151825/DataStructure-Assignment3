package com.johnabbott.recursion.application;

import java.util.Arrays;

import com.johnabbott.recursion.model.Task1;
import com.johnabbott.recursion.model.Task2;
import com.johnabbott.recursion.model.Task3;

public class RunProgram {
	public static void main(String[] args) {

		System.out.println("-----------------------------Task 1---------------------------");
		Task1 task1 = new Task1();
		String str = "abcabaabaabcabcaabbccabc";
		int[] counter = task1.countSubstrings(str);
		System.out.println("Total Number Of abc = " + counter[0]);
		System.out.println("Total Number Of aba = " + counter[1]);

		System.out.println("-----------------------------Task 2---------------------------");
		Task2 task2 = new Task2();
		System.out.println("Total Number Of 11 = " + task2.count11("121111115111781111211"));

		System.out.println("-----------------------------Task 3---------------------------");
		Task3 task3 = new Task3();
		int[] array = new int[] { 5,2,3};
		System.out.println("Given Array = " + Arrays.toString(array));
		task3.SplitArrayPossibleOrNot(array);
	}
}
