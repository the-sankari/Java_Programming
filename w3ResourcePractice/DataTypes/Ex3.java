package DataTypes;

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        try (Scanner readScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer between 0 and 1000: ");
            int integerNumber = readScanner.nextInt();

            int firstDigit = integerNumber % 10;
            int remainder = integerNumber / 10;
            int secondDigit = remainder % 10;
            remainder = remainder / 10;
            int thirdDigit = remainder % 10;
            remainder = remainder / 10;
            int fourthDigit = remainder % 10;
            int sum = thirdDigit + secondDigit + firstDigit +  fourthDigit;

            System.out.print(" Sum = " + sum);
        }
        
    }
}