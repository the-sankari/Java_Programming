package loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int counter;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter loop counter value >> ");
        counter = inputDevice.nextInt();
        System.out.println("Before Loop " + counter);
        while (counter < 10) {
            System.out.println("Inside Loop- Counter= " + counter);
            counter++;
        }
        // counter++;
        System.out.println("After While Loop " + counter);
    }
}