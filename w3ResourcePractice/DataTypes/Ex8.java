package DataTypes;
import java.util.Scanner;

public class Ex8{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        System.out.print("Enter side length value: ");
        double value = readScanner.nextDouble();

        System.out.print("\nSquare:" + value * value);
        System.out.print("\nCube: " + value * value * value);
        System.out.print("\nFourt power: " + Math.pow(value, 4));
    }
}