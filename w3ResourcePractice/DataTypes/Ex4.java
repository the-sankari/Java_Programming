package DataTypes;

import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
            System.out.print("Enter minuites: ");
            double minuite = readScanner.nextDouble();
        
        double minuiteInYear = 365 * 24 * 60;

        long years = (long)(minuite / minuiteInYear);
        int days = (int)(minuite / 60 / 24) % 365;
        
        System.out.print((int)minuite + " minuites is approximately " + years + " years and " + days + " days");
    }
}