package ConditionalStatement;

import java.util.Scanner;


public class Ex22 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = readScanner.nextInt();
        int s = 1, x, i, j;

        for(i = 0; i < row; i++){
            for(x = 1; x <= row - i; x++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                if (j == 0 || i ==0) {
                    s = 1;
                } else {
                    s = s * (i - j + 1)/ j;
                }
                System.out.print( " " + s);
            }
            System.out.println();
        }

        // for (i = 0; i < row; i++) {
        //     for (x = 1; x <= row - i; x++) {
        //         System.out.print(" ");
        //     }
        //     for (j = 0; j <= i; j++) {
        //         if (j == 0 || i == 0) {
        //             s = 1;
        //         } else {
        //             s = s * (i - j + 1) / j;

        //         }
        //         System.out.print(" " + s);
        //     }
        //     System.out.print("\n");
        // }

    }
}
