package lab2;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
		// int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr = { 11, 32, 13, 54, 5 };

		System.out.println("Second smallest elemnt is " + " " + ex.getSecondSmallest(arr));
	}

	private int getSecondSmallest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];

	}

}
