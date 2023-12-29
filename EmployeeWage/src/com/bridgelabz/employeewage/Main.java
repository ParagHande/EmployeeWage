package com.bridgelabz.employeewage;

public class Main {
	public static void main(String[] args) {
		
		EmployeeWage company1 = new EmployeeWage("Mahindra",18, 24, 192);
		EmployeeWage company2 = new EmployeeWage("TCS",25, 20, 180);
		EmployeeWage company3 = new EmployeeWage("Capgemini",20, 20, 180);
		
		company1.computeEmployeeWage();
		company2.computeEmployeeWage();
		company3.computeEmployeeWage();
	}
	

}
