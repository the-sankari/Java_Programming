import java.util.Scanner;

public class OcatFromDecimal{
    public static void main(String[] args) {
        int decimalNumber, reminder, quot, i = 1, j;
        int octNumber[] =  new int[100];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            decimalNumber = scan.nextInt();
        }

        quot = decimalNumber;

        while(quot != 0){
            octNumber[i++] = quot%8;
            quot = quot/8;
        }

        System.out.print("Ocatl number is: ");
        for(j=i-1; j>0; j--){
            System.out.print(octNumber[j]);
        }
        System.out.print("\n");

    }
}