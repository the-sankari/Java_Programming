package ConditionalStatement;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("Enter the terms: ");
     int number = readScanner.nextInt();
int sum = 0;
     for (int i = 1; i <= number; i++) {
        System.out.println(2*i);
        sum += 2*i + 1;
     }
     System.out.println(sum);
    }
    


}
