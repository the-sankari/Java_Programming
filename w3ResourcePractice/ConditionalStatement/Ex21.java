package ConditionalStatement;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int r = readScanner.nextInt();
        int i , j;
        for(i=0;i<=r;i++)
   {
     for(j=1;j<=r-i;j++)
     System.out.print(" ");
     for(j=1;j<=2*i-1;j++){

         System.out.print("*");
        }
        System.out.print("\n");
   }
 
   for(i=r-1;i>=1;i--)
   {
     for(j=1;j<=r-i;j++)
     System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
       System.out.print("*");
     System.out.print("\n");
   }

    }
}
