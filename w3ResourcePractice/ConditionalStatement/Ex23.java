package ConditionalStatement;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner readsScanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = readsScanner.nextInt();

        for (int i = number; i > 0; i--) {
            // System.out.print("-");
            for (int j = number - i; j > 0; j--) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
