package com.bridgelabz.employeewage;


public class EmployeeWage {
	// UC 6****************************************************************************
	public static void main(String[] args) {
		int workingHourPerDay5 = 3;
		int wagesPerHour5 =20;
		int wages5 = 0;
		int maxWorkingDay5 = 20;
		int workingDay5 = 0;
		int maxWorkingHours5 = 100;
		int totalWorkingHours5 = 0;
		boolean condition = true;
		while(condition) {
			workingDay5++;
			totalWorkingHours5 = totalWorkingHours5+workingHourPerDay5;
			wages5 = wagesPerHour5*totalWorkingHours5;
			System.out.println("Day "+workingDay5 +", Total Working Hours = "+totalWorkingHours5 +", Total Wages = "+wages5);
			if (maxWorkingDay5<=workingDay5 || maxWorkingHours5<=totalWorkingHours5) {
				condition = false;
				System.out.println("\nWages till, 100 woking hours OR 20 days reached = "+wages5);
			}
		}
	}
}
