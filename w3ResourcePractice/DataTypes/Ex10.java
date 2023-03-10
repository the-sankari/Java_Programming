package DataTypes;
import java.util.Scanner;

public class Ex10{
    public static void main(String[] args) {
        Scanner readSc = new Scanner(System.in);

        System.out.print("Input six digit number: ");
        int number = readSc.nextInt();

        int n1 = number / 100000 % 10;
        int n2 = number / 10000 % 10;
        int n3 = number / 1000 % 10;
        int n4 = number / 100 % 10;
        int n5 = number / 10 % 10;
        int n6 = number % 10;

        System.out.print(n1 + " " + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);


    }
}