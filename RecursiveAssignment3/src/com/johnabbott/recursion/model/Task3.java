package com.johnabbott.recursion.model;

import java.util.Arrays;

public class Task3 {

	public boolean helper(int array[], int length, int startpoint, int leftsum, int rightsum) {

		// exit condition
		if (startpoint == length) {
			return leftsum == rightsum;
		}

		// If divisible by 5 then add to the left sum
		if (array[startpoint] % 5 == 0) {
			leftsum += array[startpoint];
		}

		// If divisible by 3 but not by 5 then add to the right sum
		else if (array[startpoint] % 3 == 0) {
			rightsum += array[startpoint];
		}

		// it can be added to any
		else {
			return helper(array, length, startpoint + 1, leftsum + array[startpoint], rightsum)
					|| helper(array, length, startpoint + 1, leftsum, rightsum + array[startpoint]);
		}

		// when element is multiple of 3 or 5
		return helper(array, length, startpoint + 1, leftsum, rightsum);
	}

	public boolean splitArray(int arr[], int length) {
		// Initially setting start, leftsum and rightsum to 0
		int startpoint = 0, leftsum = 0, rightsum = 0;
		boolean result = helper(arr, length, startpoint, leftsum, rightsum);

		return result;
	}

}