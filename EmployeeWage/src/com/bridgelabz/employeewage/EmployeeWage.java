package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	String companyName;
	int wagePerHour;
	int workingDayPerMonth;
	int workingHourPerMonth;

	public EmployeeWage(String companyName, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
		super();
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingDayPerMonth = workingDayPerMonth;
		this.workingHourPerMonth = workingHourPerMonth;
	}
	
	@Override
	public String toString() {
		return "EmployeeWage [Company Name=" + companyName + ", Wage Per Hour=" + wagePerHour + ", Working Day Per Month="
				+ workingDayPerMonth + ", Working Hour Per Month=" + workingHourPerMonth + "]";
	}
	
	public void usecase() {
		System.out.println("Comany Name = "+companyName);
		usecases(wagePerHour, workingDayPerMonth, workingHourPerMonth);
	}
	
	public void usecases(int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
		boolean present = true;
		uc1(present);
		uc2(wagePerHour);
		uc3(wagePerHour);
		uc4(wagePerHour);
		uc5(wagePerHour, workingDayPerMonth);
		uc6(wagePerHour, workingDayPerMonth, workingHourPerMonth);
	}
	
	public void uc1(boolean present) {
		System.out.println("\nUC 1 - Using Random ");
		Random random = new Random();
		if (present == random.nextBoolean()) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
	public void uc2(int wagePerHour) {
		System.out.println("\nUC 2 ");
		int fullDayHour = 8;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		System.out.println("Daily Employee Wage = "+ dailyEmployeeWage);
	}
	public void uc3(int wagePerHour) {
		System.out.println("\nUC 3 ");
		int fullDayHour = 9;
		int partTimeHour = 4;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		int partTimeDailyEmployeeWage = wagePerHour * partTimeHour;
		System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage);
		System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage);
	}
	public void uc4(int wagePerHour) {
		System.out.println("\nUC 4 -Using Switch  ");
		int fullDayHour = 9;
		int partTimeHour = 4;
		int dailyEmployeeWage = 0;
		int partTimeDailyEmployeeWage = 0;
		switch (partTimeHour) {
		case 9: dailyEmployeeWage = wagePerHour * fullDayHour;
						  System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage);
			break;
		case 4:partTimeDailyEmployeeWage = wagePerHour * partTimeHour;
						  System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage);
			break;
		default: System.out.println("Employee is not working  anymore");
			break;
		}
	}
	public void uc5(int wagePerHour, int workingDayPerMonth) {
		System.out.println("\nUC 5");
		int fullDayHour = 8;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		System.out.println("Wages for a Month = "+dailyEmployeeWage*workingDayPerMonth);
	}
	public void uc6(int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
		System.out.println("\nUC 6");
		int workingHourPerDay = 3;
		int wages = 0;
		int workingDay = 0;
		int totalWorkingHours = 0;
		boolean condition = true;
		while(condition) {
			workingDay++;
			totalWorkingHours = totalWorkingHours+workingHourPerDay;
			wages = wagePerHour*totalWorkingHours;
			//System.out.println("Day "+workingDay +", Total Working Hours = "+totalWorkingHours +", Total Wages = "+wages);
			if (workingDayPerMonth<=workingDay || workingHourPerMonth<=totalWorkingHours) {
				condition = false;
				System.out.println("Wages till minimum "+totalWorkingHours+" woking hours OR minimum "+workingDayPerMonth+" days reached = "+wages);
				System.out.println("\n---------------------------------------------------------------------------------\n");
			}
		}
	}

}
