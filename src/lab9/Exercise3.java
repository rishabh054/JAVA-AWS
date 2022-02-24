package lab9;

import java.util.Scanner;

public class Exercise3 {
	
	interface Intf2
	{
		 Boolean validate(String x,String y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intf2 intf = (String x,String y) ->{
			if(x.equals("Rishabh") && y.equals("Kumar"))
			{
				return true;
			}
			else 
				return false;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String user =sc.next();
		System.out.println("Enter Password");
		String pass =sc.next();
		System.out.println(intf.validate(user,pass));
		

	}

}
