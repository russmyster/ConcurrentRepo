package csc120.zybooks.chapter2;
//package csc120.week1.jan30

import java.util.Scanner;

public class lab13SalaryCalc{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        double hourlyWage;
        double workHoursPerWeek = 0;
        double workWeeksPerYear = 0;
        final int MONTHS_PER_YEAR = 12;     // FIXME: Declare as final and use standard naming   
        double monthlySalary;
        double annualSalary;

        System.out.print("Enter hourly wage: ");
        hourlyWage = scnr.nextDouble();

        // FIXME: Get user input values for workHoursPerWeek and workWeeksPerYear
        System.out.print("Enter work hours per week: ");
        workHoursPerWeek = scnr.nextDouble();      
        System.out.print("Enter the number of work weeks per year: ");
        workWeeksPerYear = scnr.nextDouble();

        annualSalary = (hourlyWage * workHoursPerWeek) * workWeeksPerYear;
        System.out.printf("Annual salary is: %.2f\n", annualSalary);

        // TODO: Change monthsPerYear to the final variable that uses the standard naming
        monthlySalary = ( (hourlyWage * workHoursPerWeek) * workWeeksPerYear) / MONTHS_PER_YEAR;
        System.out.printf("Monthly salary is: %.2f", monthlySalary);
    }
}