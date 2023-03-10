package DataTypes;

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter a degree in Farhenhit: ");
        double farhenheit = readScanner.nextDouble();

        double toCelcius = ((5 * (farhenheit - 32.0)) / 9.0);

        System.out.println(farhenheit +  " degree Fahrenheit = " + toCelcius + " in Celcius.");

        System.out.print("Enter a degree in Celcius: ");
        double celcius = readScanner.nextDouble();

        double toFahrenheit = (((9. * celcius)+ 160.) / 5.);
        System.out.print(celcius + " degree Celcius = " + toFahrenheit + " in Fahrenheit.");
        
    }
}