package lab2;

import java.util.Arrays;

public class Exercise4 {
	public static void main(String[] args) {

		Exercise4 ex = new Exercise4();

		int[] arr = { 10, 20, 20, 30, 30, 40, 50, 50 };

		// int[] arr = { 10,5,20,30,55,44,5,55};
		int length = arr.length;

		length = removeDuplicateElements(arr);
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int removeDuplicateElements(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;

	}
}
