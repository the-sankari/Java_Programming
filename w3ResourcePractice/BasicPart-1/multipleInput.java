import java.util.Scanner;


public class multipleInput {
    public static void main(String[] args) {
        double number = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to calculate: ");
        int num = sc.nextInt();
        while (x <= num) {
            System.out.print("Input number: " + (int) x + " : ");
            number +=sc.nextInt();
            x +=1;
        }
        double avg = number / num;
        System.out.print("Average: " + avg);
    }
}
