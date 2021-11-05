package com.practice.algorithms;

import java.util.Arrays;

public class QuickSort {

	private static void sortByquickSort1(int[] inputArr, int start, int end) {

		if (start < end) {
			int ppValue = getPartition(inputArr, start, end);
			sortByquickSort1(inputArr, start, ppValue - 1);
			sortByquickSort1(inputArr, ppValue + 1, end);

		}
	}

	private static int getPartition(int[] inputArr, int start, int end) {

		int pivot = inputArr[end];

		int i = start - 1;
		for (int j = start; j < inputArr.length; j++) {

			if (inputArr[j] < pivot) {
				i++;
				int iVal = inputArr[i];
				int jVal = inputArr[j];
				inputArr[i] = jVal;
				inputArr[j] = iVal;
			}
		}
		int ival = inputArr[i+1];
		inputArr[i+1] = pivot ;
		inputArr[end] = ival;
		return i+1;

	}

	public static void main(String[] args) {
		int inputArr[] = { 1, 3, 9, 7, 18, 12, 11, 13, 5, 4 };

		System.out.println("Given Array");
		System.out.println(Arrays.toString(inputArr));
		QuickSort qs = new QuickSort();
		qs.sortByquickSort1(inputArr, 0, inputArr.length - 1);
		System.out.println(Arrays.toString(inputArr));
	}

}
