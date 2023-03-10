package ConditionalStatement;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner reeadScanner = new Scanner(System.in);

        //Print a floating-point number in a specified format

        System.out.print("Input a number: ");
        double number = reeadScanner.nextDouble();

        if (number > 0) {
            if (number < 1) {
                System.out.print("Positive small number.");
            }else if( number > 1000000){
                System.out.print("Positive large number.");   
            }else{
                System.out.print("Positive number.");
            }
        }else if(number < 0){
            if (Math.abs(number) < 1) {
            System.out.print("Negtive small number.");
                
            }else if (Math.abs(number) > 1000000) {
            System.out.print("Negtive large number.");
                
            }else{
            System.out.print("Negtive number.");
            }       
        }else{
            System.out.print("Zero");
        }


    }
}
