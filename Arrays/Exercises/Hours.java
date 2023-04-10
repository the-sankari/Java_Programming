package exercises;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount of days: ");
        int days = scanner.nextInt(); // Read number of days from user

        // Create an array to store the work hours
        double[] workHours = new double[days];

        // Read the work hours from user
        for (int i = 0; i < days; i++) {
            System.out.print("Type in work hours of day " + (i + 1) + ": ");
            workHours[i] = scanner.nextDouble();
        }

        // Calculate total work hours
        double totalWorkHours = 0;
        for (int i = 0; i < days; i++) {
            totalWorkHours += workHours[i];
        }

        // Calculate average work day length
        double averageWorkDayLength = totalWorkHours / days;

        // Print the results
        System.out.println("Total of work hours: " + totalWorkHours);
        System.out.println("Average work day length: " + averageWorkDayLength);
        System.out.print("Inputted work hours: ");
        for (int i = 0; i < days; i++) {
            System.out.print(workHours[i] + " ");
        }

        scanner.close();
    }
}
