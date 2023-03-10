package ConditionalStatement;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter how many times want to multiply: ");
        int terms = readScanner.nextInt();
        
        System.out.print("Enter the number: ");
        int times = readScanner.nextInt();

        for ( int i = 1; i <= times; i++) {
            System.out.println(terms + " x " + i + " = " + terms * i );
            
        }
    }
}