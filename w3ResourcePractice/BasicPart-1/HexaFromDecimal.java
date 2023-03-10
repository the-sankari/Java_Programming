import java.util.Scanner;

public class HexaFromDecimal{
    public static void main(String[] args) {
        int decimalNumber, reminder;
        String hexadecimalnumber = "";

        char hexaChar[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner rScanner = new Scanner(System.in);

        System.out.print("Enter A decimal number: ");
        decimalNumber = rScanner.nextInt();

        while (decimalNumber > 0) {
            reminder = decimalNumber%16;
            hexadecimalnumber = hexaChar[reminder] + hexadecimalnumber;
            decimalNumber = decimalNumber /16;
        }
        System.out.print("Hexadecimal number is: " + hexadecimalnumber + "\n");
    }
}