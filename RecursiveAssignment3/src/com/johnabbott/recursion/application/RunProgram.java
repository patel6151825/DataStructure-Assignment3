package com.johnabbott.recursion.application;

import java.util.Arrays;

import com.johnabbott.recursion.model.Task1;
import com.johnabbott.recursion.model.Task2;
import com.johnabbott.recursion.model.Task3;

public class RunProgram {
	public static void main(String[] args) {

		System.out.println("\n-----------------------------Task 1---------------------------");
		Task1 task1 = new Task1();
		String str = "abcababcaabcabcaabbccabc";
		int[] counterArray = new int[2];
		//count1 for counting abc and count2 for counting aba set to 0
		int count1=0,count2=0;
		int[] counterResult = task1.countSubstringabcAndaba(str,counterArray,count1,count2);
		System.out.println("Total Number Of abc = " + counterResult[0]);
		System.out.println("Total Number Of aba = " + counterResult[1]);

		System.out.println("-----------------------------Task 2---------------------------");
		Task2 task2 = new Task2();
		System.out.println("Total Number Of 11 = " + task2.count11("121111115111781111211"));

		System.out.println("-----------------------------Task 3---------------------------");
		Task3 task3 = new Task3();
		int[] array = new int[] { 3,10,5,3,-1};
		System.out.println("Given Array = " + Arrays.toString(array));
		Arrays.sort(array);
		task3.SplitArrayPossibleOrNot(array);
	}
}
