package ConditionalStatement;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Input a:");
        int inputA = readScanner.nextInt();
        System.out.print("Input b:");
        int inputB = readScanner.nextInt();
        System.out.print("Input c:");
        int inputC = readScanner.nextInt();

        double result = inputB * inputB - 4.0 * inputA * inputC;

        if (result > 0.0) {
            double root1 = (- inputB + Math.pow(result, 0.5)) / (2.0 * inputA);
            double root2 = (- inputB - Math.pow(result, 0.5)) / (2.0 * inputA);
            System.out.print("The roots are " + root1 + " and " + root2);          
        } else if(result == 0.0) {
            double root1 = -inputB / (2.0 * inputA);
            System.out.print("The root is " + root1);
            
        }else{
            System.out.print("The equation has no real roots.");
        }
    }
}
