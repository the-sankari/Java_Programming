package ConditionalStatement;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = readScanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 1 && j == 3) {
                    System.out.print("-");
                } else {
                    
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
