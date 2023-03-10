package DataTypes;
import java.util.Scanner;

public class Ex9{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInteger = readScanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = readScanner.nextInt();

        int sum = firstInteger + secondInteger;
        int dif = firstInteger - secondInteger;
        int prod = firstInteger * secondInteger;
        double avg = (double)((firstInteger + secondInteger)/2);
        int dis = Math.abs(firstInteger - secondInteger);
        double max = Math.max(firstInteger, secondInteger);
        double min = Math.min(firstInteger, secondInteger);

        System.out.print("Sum: " + sum + "\nDifference: " + dif + "\nProduction: " + prod + "\nAverage: " + "\nDistance: " + dis + "\nMax: " + max + "\nMin: " + min);

    }
}