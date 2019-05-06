package com.algorithms;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");

		int elements = scanner.nextInt();
		int[] numArray = new int[elements];

		// traverse

		for (int i = 0; i <= numArray.length - 1; i++) {

			int temp = scanner.nextInt();
			numArray[i] = temp;
		}

		// bubble sort

		for (int i = 0; i <= numArray.length - 1; i++) {
			for (int j = 0; j <= numArray.length - 1; j++) {
				if (numArray[i] < numArray[j]) {
					int temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}

		// print
		System.out.println("Print the array");
		for (int i = 0; i <= numArray.length - 1; i++) {
			System.out.println(numArray[i]);
		}

	}

}
