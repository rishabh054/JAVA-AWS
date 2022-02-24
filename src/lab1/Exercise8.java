package lab1;

public class Exercise8 {

	public static void main(String[] args) {
		Exercise8 ex = new Exercise8();
		int n = 31;
		System.out.println(ex.checkNumber(n));

	}

	private boolean checkNumber(int n) {

		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}

}
