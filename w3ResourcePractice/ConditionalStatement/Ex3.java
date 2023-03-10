package ConditionalStatement;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
// finding the greatest of three numbers
        System.out.print("Input the first number: ");
        int n1 = readScanner.nextInt();

        System.out.print("Input the secomd number: ");
        int n2 = readScanner.nextInt();
        
        System.out.print("Input the third number: ");
        int n3 = readScanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.print(n1 + " is greates");
        } else if(n2 > n1 && n2 > n3) {
            System.out.print(n2 + " is greates");
            
        }else{
            System.out.print(n3 + " is greates");

        }

    }
}
