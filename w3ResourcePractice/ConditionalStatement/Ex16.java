package ConditionalStatement;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = readScanner.nextInt();

        System.out.print("Enter the column: ");
        int column = readScanner.nextInt();
        // right angle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println("");
        }
        // square
        // for (int i = 1; i <= rows; i++) {
        //     System.out.print(" X ");
        //     for (int j = 1; j <= column; j++) {

        //         System.out.print(" * ");
        //     }
        //     System.out.println(" x ");
        // }

    }
}
