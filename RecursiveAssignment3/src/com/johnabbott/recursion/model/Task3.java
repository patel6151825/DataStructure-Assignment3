package com.johnabbott.recursion.model;

import java.util.Arrays;

public class Task3 {

	public void SplitArrayPossibleOrNot(int[] array) {
		boolean result=true;
		int leftSum = 0, rightSum = 0;

		int x = 0, y = 0;
		//defining two new array to contain split array
		int[] splitArray1 = new int[array.length - 1];
		int[] splitArray2 = new int[array.length - 1];

		//if array is empty or contain only 1 then can not split
		if (array.length <2) {
			result=false;
		} 
		else {
			for (int i = 0, j = array.length - 1; i <= j;) {
				if (leftSum <= rightSum) {
					leftSum += array[i];
					splitArray1[x] = array[i];
					i++;
					x++;

				} else {
					rightSum += array[j];
					splitArray2[y] = array[j];
					j--;
					y++;
				}
			}
		}

		if ((rightSum == leftSum) && result==true) {
			System.out.println("Yes splitting is possible");
			System.out.println(Arrays.toString(splitArray1));
			System.out.println(Arrays.toString(splitArray2));
		} else {
			System.out.println("No splitting is not possible");
		}
	}
}
