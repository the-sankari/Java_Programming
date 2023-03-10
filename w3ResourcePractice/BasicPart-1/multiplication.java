import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        System.out.println("   J    A   v     v  A ");
        System.out.println("   J   A A   v   v  A A");
        System.out.println("J  J  AAAAA   V V  AAAAA");
        System.out.println(" JJ  A     A   V  A     A");
        Scanner readScanner = new Scanner(System.in);
    System.out.print("Enter a multiplication number: ");
    double number = readScanner.nextDouble();
    System.out.print("Enter a multiplication number: ");
    int amount = readScanner.nextInt();
       
    for (int i = 0; i < amount; i++) {
        System.out.println(number + " x " + (i + 1) + " = " + (number * (i +1)) );
    }
    System.out.println("Perimeter is = " + (2 * number * Math.PI));
    System.out.print("Area is = " + (Math.PI * number * number));
    }
}
