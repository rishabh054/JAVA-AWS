package lab5;

import java.util.Scanner;

public class Exercise1 {
	Employee emp = new Employee();

	public static void main(String[] args) {

		Exercise1 ex = new Exercise1();
		System.out.println("Enter age of person");
		Scanner sc = new Scanner(System.in);
		int emp1 = sc.nextInt();

		Employee emp2 = new Employee(emp1);

		System.out.println("Age=" + " " + emp2.age);

		try {
			ex.validateAge(emp2.age);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	void validateAge(int x) throws ValidateAgeException {
		if (x < 15) {
			System.out.println(x);
			throw new ValidateAgeException("age should be greater than 15");

		}
		System.out.println("Perfect Age");

	}

}
