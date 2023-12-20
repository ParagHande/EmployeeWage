package com.bridgelabz.employeewage;

import java.lang.invoke.SwitchPoint;
import java.util.Random;

public class EmployeeWage {
	// UC 1****************************************************************************
		boolean present = true;
		Random random = new Random();
		if (present == random.nextBoolean()) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	// UC 2****************************************************************************
		int wagePerHour = 20;
		int fullDayHour = 8;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		System.out.println("Daily Employee Wage = "+ dailyEmployeeWage);
	// UC 3****************************************************************************
		int wagePerHour2 = 20;
		int fullDayHour2 = 8;
		int partTimeHour2 = 4;
		int dailyEmployeeWage2 = wagePerHour2 * fullDayHour2;
		int partTimeDailyEmployeeWage2 = wagePerHour2 * partTimeHour2;
		System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage2);
		System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage2);
	// UC 4****************************************************************************
		int wagePerHour3 = 20;
		int fullDayHour3 = 8;
		int partTimeHour3 = 4;
		int dailyEmployeeWage3 = 0;
		int partTimeDailyEmployeeWage3 = 0;
		switch (partTimeHour3) {
		case 8: dailyEmployeeWage3 = wagePerHour3 * fullDayHour3;
						  System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage3);
			break;
		case 4:partTimeDailyEmployeeWage3 = wagePerHour3 * partTimeHour3;
						  System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage3);
			break;
		default: System.out.println("Employee is not working  anymore");
			break;
		}		
	// UC 5****************************************************************************	
		int wagePerHour4 = 20;
		int fullDayHour4 = 8;
		int dailyEmployeeWage4 = wagePerHour4 * fullDayHour4;
		int workingDayPerMonth4 = 20;
		System.out.println("Wages for a Month = "+dailyEmployeeWage4*workingDayPerMonth4);
	// UC 6****************************************************************************
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
