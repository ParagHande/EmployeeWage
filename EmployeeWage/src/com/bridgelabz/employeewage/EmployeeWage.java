package com.bridgelabz.employeewage;


public class EmployeeWage {
	
	public static void main(String[] args) { 
		
		int wagePerHour = 20;
		int fullDayHour = 8;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		int workingDayPerMonth = 20;
		
		System.out.println("Wages for a Month = "+dailyEmployeeWage*workingDayPerMonth);
		
	}
	
}
