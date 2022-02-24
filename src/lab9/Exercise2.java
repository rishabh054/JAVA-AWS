package lab9;

import java.util.Scanner;

public class Exercise2 {
	
	interface Intf2
	{
		 String insertSpace(String x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intf2 intf = (String x) ->{
			return x.replace("", " ");
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 =sc.next();
		System.out.println(intf.insertSpace(s1));
		

	}

}
