package exercises;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many floating point numbers do you want to type: ");
        int count = scanner.nextInt(); // Read number count from user
        
        // Create an array to store the floating point numbers
        double[] numbers = new double[count];
        
        // Read the numbers from user
        for (int i = 0; i < count; i++) {
            System.out.print("Type in " + (i + 1) + ". number: ");
            numbers[i] = scanner.nextDouble();
        }
        
        // Print the numbers in reverse order
        System.out.println("Given numbers in reverse order: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        scanner.close();
    }
}
