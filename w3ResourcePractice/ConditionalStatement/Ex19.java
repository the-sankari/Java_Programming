package ConditionalStatement;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        int s, x;
        System.out.print("Enter number of rows: ");
        int rows = readScanner.nextInt();

        s = rows -1;

        for (int i = 1; i <= rows ; i++) {
            for(x = s; x != 0; x--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                
            }
            System.out.println("");
            s--;
        }
    }
}
