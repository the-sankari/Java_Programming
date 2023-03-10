package ConditionalStatement;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = readScanner.nextInt();


        for (int i = 1; i <= terms; i++) {
            System.out.print("Enter number: ");
            double number = readScanner.nextDouble();
            System.out.println("Number is: " + number + " and cube of " + number + " is: " + Math.pow(number, terms));
            
        }
    }
}
