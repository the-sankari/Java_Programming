package DataTypes;
import java.util.Scanner;

public class Ex6{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        
        System.out.print("Enter your weight: ");
        double weight = readScanner.nextDouble();

        System.out.print("Enter your height: ");
        double height = readScanner.nextDouble();

        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

        System.out.print("Body mass index is " + BMI + "\n");
    }
}
