package lab1;

public class Exercise5 {

	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;

	}

	public static void main(String[] args) {

		int number = 10;
		Exercise5 ex = new Exercise5();
		System.out.println("Sum is =" + " " + ex.calculateSum(number));

	}

}
