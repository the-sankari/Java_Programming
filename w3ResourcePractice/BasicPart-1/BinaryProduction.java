import java.util.Scanner;

public class BinaryProduction{
    public static void main(String[] args) {
        long bin1, bin2, multiply = 0;
        int digit, factor = 1;
       
        Scanner in = new Scanner(System.in);

        System.out.print("First Binary number: ");
        bin1 = in.nextLong();
        System.out.print("Second Binary number: ");
        bin2 = in.nextLong();

        while(bin2 != 0){
            digit = (int)(bin2 % 10);
            if(digit == 1)
            {
                bin1 = bin1 * factor;
                multiply = binaryProduct((int) bin1, (int) multiply);
            }else{
                bin1 = bin1 * factor;
            }
            bin2 = bin2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }
    static int binaryProduct(int bin1, int bin2){
        int i = 0, reminder = 0;
        int[] sum = new int[20];
        int binaryProductresult = 0;

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

        while(i >= 0){
           binaryProductresult = binaryProductresult * 10 + sum[i--];
           
        }
    return binaryProductresult;
    }


        
    
}