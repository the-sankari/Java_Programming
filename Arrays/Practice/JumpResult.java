package Arrays.Practice;
import java.util.Scanner;

public class JumpResult {
    public static void main(String[] args) {
        String cs;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in a character string (no spaces)");
        cs = reader.next();

        char[] charArray = cs.toCharArray();

        System.out.println();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);            
        }
    }
}
