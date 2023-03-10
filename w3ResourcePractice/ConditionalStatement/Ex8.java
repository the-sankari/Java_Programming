package ConditionalStatement;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner rScanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = rScanner.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        if(input.length() > 1){
            System.out.print("Error!!! not a single character.");
        }else if (!(uppercase || lowercase)) {
            System.out.print("Error!!! not a letter. Enter a uppercase or lowercase letter.");
        }else if(vowels){
            System.out.print(input + " is a vowel");
        }else{
            System.out.print(input + " is a consonant.");
        }
        
    }
}
