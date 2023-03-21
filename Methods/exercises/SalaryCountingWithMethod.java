package Methods.exercises;

import java.util.Scanner;

public class SalaryCountingWithMethod {
    public static void main(String[] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;

        hours = askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();

        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);

        taxPart = taxlessSalary * taxPercent / 100;

        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary - taxPart));
    }

    private static Scanner reader = new Scanner(System.in);
    private static double askHours() {
        System.out.print("Type in the number of work hours: ");
        double hours = reader.nextDouble();
        return hours;
    }
    private static double askSalaryPerHour(){
        System.out.print("Type in salary per hour: ");
        double salaryPerHour = reader.nextDouble();
        return salaryPerHour;
    }
    private static double askTaxPercent(){
        System.out.print("Type in tax percent: ");
        double taxPercent = reader.nextDouble();
        return taxPercent;
    }

    private static double countTaxlessSalary(double hours, double salaryPerHour){
        double totalSalary = hours * salaryPerHour;
        return totalSalary;
    }


    // Write the missing methods here
    // Methods are written in the text box below.
}