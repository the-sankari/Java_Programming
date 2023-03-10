package ConditionalStatement;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float x = readScanner.nextFloat();

        System.out.print("Enter second number: ");
        float y = readScanner.nextFloat();

        x = Math.round(x * 1000);
        x = x /1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y) {
            System.out.print("Same");
            
        } else {
            System.out.print("Different");
            
        }


    }
}
