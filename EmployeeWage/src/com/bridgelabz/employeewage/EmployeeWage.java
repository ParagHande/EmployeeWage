package com.bridgelabz.employeewage;


public class EmployeeWage {
	
	public static void main(String[] args) { 
		
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyEmployeeWage = 0;
		int partTimeDailyEmployeeWage = 0;
		
		switch (partTimeHour) {
		case 8: dailyEmployeeWage = wagePerHour * fullDayHour;
						  System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage);
			break;
		case 4:partTimeDailyEmployeeWage = wagePerHour * partTimeHour;
						  System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage);
			break;
		default: System.out.println("Employee is not working  anymore");
			break;
		}
	}
	
}
