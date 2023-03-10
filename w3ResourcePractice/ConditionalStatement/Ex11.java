package ConditionalStatement;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Input number: ");
        int n = readScanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        sum +=i;
            
        }
        System.out.println(sum);
    }
}
