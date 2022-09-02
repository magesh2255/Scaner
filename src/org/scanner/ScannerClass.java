package org.scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int empId = s.nextInt();
	System.out.println("Employee id is :12121"+empId);
	
	String empName= s.nextLine();
	System.out.println("Employee Name is :"+empName);
	
	String empEmail= s.nextLine();
	System.out.println("Employee email id is:"+empEmail);
	
	int empPhone = s.nextInt();
	System.out.println("employee no is:"+empPhone);
	
	float empSalary = s.nextFloat();
	System.out.println("Employee salary is:"+empSalary);
	
	char empGender= (char) s.nextInt();
	System.out.println("Employee Gender");
	
	String empCity = s.nextLine();
	System.out.println("Employee city is :");
	
	
	
	
	
	
	
	}
}
