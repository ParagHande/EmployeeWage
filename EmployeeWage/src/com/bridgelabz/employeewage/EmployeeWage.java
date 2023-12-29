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
	
	public void computeEmployeeWage() {
		System.out.println("Comany Name = "+companyName);
		useCases(wagePerHour, workingDayPerMonth, workingHourPerMonth);
	}
	
	public void useCases(int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
		boolean present = true;
		uc1_EmployeeIsPresentOrAbsent(present);
		uc2_DailyEmployeeWage(wagePerHour);
		uc3_PartTimeEmployeeWage(wagePerHour);
		uc4_SolvingUsingSwitchCase(wagePerHour);
		uc5_WagesForAMonth(wagePerHour, workingDayPerMonth);
		uc6_WagesTillWorkingHourAndDaysReached(wagePerHour, workingDayPerMonth, workingHourPerMonth);
	}
	
	public void uc1_EmployeeIsPresentOrAbsent(boolean present) {
		System.out.println("\nUC 1 - Employee is present or absent(Using - random) ");
		Random random = new Random();
		if (present == random.nextBoolean()) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
	public void uc2_DailyEmployeeWage(int wagePerHour) {
		System.out.println("\nUC 2 - Daily employee wage");
		int fullDayHour = 8;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		System.out.println("Daily Employee Wage = "+ dailyEmployeeWage);
	}
	public void uc3_PartTimeEmployeeWage(int wagePerHour) {
		System.out.println("\nUC 3 - Part time employee wage");
		int fullDayHour = 9;
		int partTimeHour = 4;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		int partTimeDailyEmployeeWage = wagePerHour * partTimeHour;
		System.out.println("Full Time Daily Employee Wage = "+dailyEmployeeWage);
		System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage);
	}
	public void uc4_SolvingUsingSwitchCase(int wagePerHour) {
		System.out.println("\nUC 4 - Solving using switch case statement  ");
		int fullDayHour = 9;
		int partTimeHour = 4;
		int dailyEmployeeWage = 0;
		int partTimeDailyEmployeeWage = 0;
		switch (partTimeHour) {
		case 9: dailyEmployeeWage = wagePerHour * fullDayHour;
						  System.out.println("Full time daily employee wage = "+dailyEmployeeWage);
			break;
		case 4:partTimeDailyEmployeeWage = wagePerHour * partTimeHour;
						  System.out.println("Part Time Daily Employee Wage = "+partTimeDailyEmployeeWage);
			break;
		default: System.out.println("Employee is not working  anymore");
			break;
		}
	}
	public void uc5_WagesForAMonth(int wagePerHour, int workingDayPerMonth) {
		System.out.println("\nUC 5 - Wages for a month");
		int fullDayHour = 8;
		int dailyEmployeeWage = wagePerHour * fullDayHour;
		System.out.println("Wages for a Month = "+dailyEmployeeWage*workingDayPerMonth);
	}
	public void uc6_WagesTillWorkingHourAndDaysReached(int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
		System.out.println("\nUC 6 - Wages till, total working hour and days is reached for a month");
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
