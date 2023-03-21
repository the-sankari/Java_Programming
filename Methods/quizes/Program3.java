import java.util.Scanner;
public class Program3 { 
    public static void main(String[] args) { 
        int firstNumber, secondNumber, answer; 
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number: "); 
        firstNumber = reader.nextInt(); 
        System.out.print("Input another number: "); 
        secondNumber = reader.nextInt();
        answer = calculation(firstNumber); 
        System.out.print("The answer is " + answer); 
    }     
    private static int calculation (int firstNumber, int secondNumber) { 
        int answer; 
        answer = firstNumber + secondNumber; 
        return answer; 
    } 
    private static int calculation (int number) { 
        int answer; 
        answer = number * number; 
        return answer; 
    } 
}