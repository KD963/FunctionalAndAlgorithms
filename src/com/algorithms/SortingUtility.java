package com.algorithms;

public class Util {

	// binary search method for integer

	public static int binarySearch(int[] arr, int low, int high, int key) {

		if (high >= low) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, low, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, high, key);
			}
		}

		return -1;

	}

	// binary search method for string

	public static int binaryString(char[] ch, int low, int high, int key) {
		if (high >= low) {
			int mid = low + (high - low) / 2;

			if (ch[mid] == key) {
				return mid;
			}
			if (ch[mid] > key) {
				return binaryString(ch, low, mid - 1, key);
			} else {
				return binaryString(ch, mid + 1, high, key);
			}
		}

		return -1;
	}

	// insertion sort for integers
	public static void insertionNumbers(int[] numbers) {
		int j;
		for (int i = 1; i < numbers.length; i++) {
			int key = numbers[i];
			for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
				numbers[j + 1] = numbers[j];

			}
			numbers[j + 1] = key;
		}
	}

	// insertion sort for string
	public static void insertionString(String str) {
		char str1[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			str1[i] = str.charAt(i);

		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
		System.out.println();
		int j;
		for (int i = 1; i < str1.length; i++) {
			char key = str1[i];
			for (j = i - 1; j >= 0 && str1[j] > key; j--) {
				str1[j + 1] = str1[j];

			}
			str1[j + 1] = key;
		}
		str=new String(str1);
		System.out.println(str);
		

	}

	// bubble sort for integers
	public static void bubbleNumbers(int[] num) {
		int n = num.length;
		for(int i = 0; i <= num.length-1; i++) {
			for(int j = 0; j <= num.length-1; j++) {
				if(num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}

	// bubble sort for strings
	public static void bubbleString(String str) {
		char str1[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			str1[i] = str.charAt(i);

		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}

		int n = str1.length;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (str1[i] < str1[j]) {
					char temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
		
	}

}
