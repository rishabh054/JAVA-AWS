package lab2;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int[] arr = { 12, 25, 34, 45, 90 };
		Exercise3 ad = new Exercise3();
		Arrays.sort(ad.getSorted(arr));
		for (int n : arr) {
			System.out.print(n + " ");
		}

	}

	int[] getSorted(int[] arr) {
		int index = 0;
		for (int num : arr) {
			arr[index] = rev(num);
			index++;
		}

		return arr;
	}

	public int rev(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;

	}
}
