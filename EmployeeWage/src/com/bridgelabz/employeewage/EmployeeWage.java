package com.bridgelabz.employeewage;

public class EmployeeWage {
	
	public static void main(String[] args) { 
		int workingHourPerDay = 8;
		int wagesPerHour =20;
		int wages = 0;
		int maxWorkingDay = 20;
		int workingDay = 0;
		int maxWorkingHours = 100;
		int totalWorkingHours = 0;
		boolean condition = true;
		
		while(condition) {
			workingDay++;
			totalWorkingHours = totalWorkingHours+workingHourPerDay;
			wages = wagesPerHour*totalWorkingHours;
			
			System.out.println("Day "+workingDay +", Total Working Hours = "+totalWorkingHours +", Total Wages = "+wages);
			
			if (maxWorkingDay<=workingDay || maxWorkingHours<=totalWorkingHours) {
				condition = false;
				System.out.println("\nWages till, 100 woking hours OR 20 days reached = "+wages);
			}
		}
	}
}
