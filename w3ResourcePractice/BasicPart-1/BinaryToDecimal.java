import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        Scanner rScanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        binaryNumber = rScanner.nextLong();

        while(binaryNumber != 0){
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.print("Decimal number: " + decimalNumber);
    }
}