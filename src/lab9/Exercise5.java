package lab9;

import java.util.Scanner;

public class Exercise5 {
	
	interface Intf1
	{
		 int fact(int x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intf1 intf = (int x) ->{
			int fact1=1;
			for(int i=1;i<=x;i++)
			{
				fact1=fact1*i;
			}
			return fact1;
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to calculate factorial");
		int num =sc.nextInt();
		System.out.println(intf.fact(num));
		

	}

}
