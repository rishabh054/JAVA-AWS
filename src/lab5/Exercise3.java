package lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 ex = new Exercise3();
		System.out.println("Enter Salary of Employe");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextInt();

		Employee emp2 = new Employee(salary);

		System.out.println("salary=" + " " + emp2.salary);

		try {
			ex.validateSalary(emp2.salary);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	void validateSalary(double x) throws EmployeeException {
		if (x < 3000) {
			System.out.println(x);
			throw new EmployeeException(" salary should be greater than 3000");

		}
		System.out.println("Perfect Salary");

	}

}
