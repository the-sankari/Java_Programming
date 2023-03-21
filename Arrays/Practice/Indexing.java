package Arrays.Practice;
import java.util.Scanner;

public class Indexing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int elements = 5;
        int[] iArray = new int[elements];

        for (int i = 0; i < elements; i++) {
            System.out.println("iArray [" + i + "] == " + iArray[i]);
        }
        System.out.println("=========================");
        for (int i = 0; i < elements; i++) {
            System.out.print("Type in " + (i +1) + ". number: ");
            iArray[i] = read.nextInt();
        }
        System.out.println("=========================");
        for (int i = 0; i < elements; i++) {
            System.out.println("iArray [" + i + "] == " + iArray[i]);
            
        }
        System.out.println("Array size: " + iArray.length);
    }
}
