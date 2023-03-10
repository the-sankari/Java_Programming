package ConditionalStatement;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner rScanner = new Scanner(System.in);
        int rows, number = 1;
        System.out.print("Enter number of rows: ");
        rows = rScanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
                
            }
            System.out.println();
        }
    }
}
