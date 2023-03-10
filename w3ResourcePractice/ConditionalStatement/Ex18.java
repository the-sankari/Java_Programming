package ConditionalStatement;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = readScanner.nextInt();
        int k = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");

                
            }
            System.out.println("");
        }
    }
}
