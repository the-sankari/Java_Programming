package loops;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            System.out.println("1st Loop");
            for (int j = 0; j <= 2; j++) {
            System.out.println("\t2nd Loop");
                for (int j2 = 0; j2 <= 2; j2++) {
            System.out.println("\t\t3rd Loop");
                    for (int k = 0; k <=2; k++) {
            System.out.println("\t\t\t5th Loop");
                        
                    }
                }              
            }
        }
    }
    
}