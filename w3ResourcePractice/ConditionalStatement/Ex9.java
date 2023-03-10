package ConditionalStatement;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = readScanner.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) && (year % 400 ==0);

        if (x && (y || z)) {
            System.out.print(year + " is a leap year");
            
        } else {
         System.out.print(year + " is not a leap year");   
        }
        readScanner.close();
    }
}
