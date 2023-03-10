import java.util.Scanner;

public class TwoBinaryNumber{
    public static void main(String[] args) {
        long bin1, bin2, multiply = 0;
        
        int i = 0, reminder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("First Binary number: ");
        bin1 = in.nextLong();
        System.out.print("Second Binary number: ");
        bin2 = in.nextLong();

        while(bin1 != 0 || bin2 != 0){
            sum[i++] = (int)((bin1 % 10 + bin2 % 10 + reminder) % 2);
            reminder = (int)((bin1 % 10 + bin2 % 10 + reminder) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }
        if(reminder != 0){
            sum[i++] = reminder;
        }
        --i;

        System.out.print("Sum of tow binary numbers: ");
        while(i >= 0){
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
        
    }
}