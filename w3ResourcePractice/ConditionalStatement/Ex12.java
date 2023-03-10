package ConditionalStatement;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        int i, n = 0, s = 0;
        double avg;
        Scanner readScanner = new Scanner(System.in);
        System.out.print("How many numbers want to input: ");
        int numbers = readScanner.nextInt();
        for(int j = 1; j <= numbers; j++){
            System.out.print("Enter a number: ");
            int input = readScanner.nextInt();
            s += input;
        }
        avg = s/numbers;
        System.out.println("Sum: " + s + " Average: " + avg);

    }
}
