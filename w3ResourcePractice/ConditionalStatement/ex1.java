package ConditionalStatement;
import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        Scanner rScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = rScanner.nextInt();

        if (number > 0 ) {
            System.out.print(number + " is a positive number.");
            
        } else if(number < 0) {
            System.out.print(number + " is a negative number.");
            
        }else{
            System.out.print(number + " is zero.");

        }
    }
    
}