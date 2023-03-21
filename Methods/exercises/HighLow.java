package Methods.exercises;

import java.util.Scanner;
 
public class HighLow {
    public static void main(String[] args) {
        int number1, number2, number3, high, low;
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type in the first integer: ");
        number1 = reader.nextInt();
 
        System.out.print("Type in the second integer: ");
        number2 = reader.nextInt();
 
        System.out.print("Type in the third integer: ");
        number3 = reader.nextInt();
 
        high = high(number1, number2, number3);
        low = low(number1, number2, number3);
 
        System.out.print("Highest number was " + high);
        System.out.print(" and the lowest was " + low + "\n");
    }
 
    //  Declarations of the methods high() and low()
    private static int high(int number1, int number2, int number3){
        if (number1 > number2 && number1 > number3) return number1;
        else if (number2 > number1 && number2 > number3) return number2;
        else return number3;
    }
    private static int low(int number1, int number2, int number3){
        if (number1 < number2 && number1 < number3) return number1;
        else if (number2 < number1 && number2 < number3) return number2;
        else return number3;
    }
 
}
