package com.bridgelabz.employeewage;


public class EmployeeWage {
	
	public static void main(String[] args) { 
		
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		int partTimeDailyEmployeeWage = wagePerHour * partTimeHour;
		System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage);
		System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage);
	}
	
}
