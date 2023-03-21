package Methods.exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        count(number);
    }

    private static int count(int number) {
        System.out.print("Multiplication chart of the number " + number + "\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * number);
        }
        return number;
    }
}
