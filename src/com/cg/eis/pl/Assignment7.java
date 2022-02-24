package com.cg.eis.pl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class Assignment7 {

	public static void main(String[] args) {
		
		String id;
		String name;
		double salary;
		String designation;
		String insuranceScheme;
		
		Map< String, List<Employee> > m=new HashMap< String, List<Employee> >();
		List<Employee> ListForFinance=new ArrayList<Employee>();
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.print("\nThe Choices:\n1-->Add\n2-->View \n3-->Delete\n4-->Update\n\n");
			System.out.println("Enter the choice: ");
			System.out.println("To quit type -1");
			
			int num=scn.nextInt();
			if(num == -1)
			{
			break;
			}
			switch(num)
			{
			case 1:{
				System.out.print("\nId: ");
				id=scn.next();
				System.out.print("\nName: ");
				name=scn.next();
				System.out.print("\nSalary: ");
				salary=scn.nextDouble();
				System.out.print("\nDesignation");
				designation=scn.next();
				Employee employee1=new Employee();
				ListForFinance.add(employee1);
				m.put(id, ListForFinance);
				break;
				
			}
			
			}
			
		}

	}

}
