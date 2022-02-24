package lab5;

import java.util.Scanner;

public class Exercise2 {
	
	//Exercise2 ex=new Exercise2();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fname;
		String lname;
		//System.out.println("Enter First Name");
		//fname=sc.next();
		//System.out.println("Enter last Name");
		//lname=sc.next();
		fname=null;
		lname=null;
		
		 Names nm=new Names(fname,lname);
		 System.out.println("Fist  Name is "+" "+nm.fname + " Last  Name is "+" "+nm.lname);
		
		 Exercise2 ex=new Exercise2();
		 try {
			ex.ValidateAge(nm.fname,nm.lname);
		} catch (ValidateNameException e) {
			
			e.printStackTrace();
		}

	}
	void ValidateAge(String x, String y) throws ValidateNameException{
		if(x != null && y!= null) {
			System.out.println("Fist nameis" +x +" and last name"+y);
			
		}
		else {
			throw new ValidateNameException("Please Provide first and Last name");
		}
		
	}

}
