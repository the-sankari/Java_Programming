package Methods.exercises;
import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        String firstName, secondName;
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type in the first name: ");
        firstName = reader.nextLine();
 
        System.out.print("Type in the second name: ");
        secondName = reader.nextLine();            
 
        System.out.println("\n**********");
        greet();
        System.out.println("**********");
 
        greet(firstName);
        System.out.println("**********");
 
        greet(firstName, secondName);
        System.out.println("**********");
    }

    private static String greet(){
        String sayHi = "Hi!";
        System.out.println(sayHi);
        return sayHi;

    }
    private static String greet(String firstName){
      System.out.println("Hi, " + firstName);
      return firstName;
    }
    private static String greet(String firstName, String secondName){
        String greetings ="Hi," + firstName + " and " + secondName;
        System.out.println(greetings);
        return greetings;
      }
   
 
    //  the needed greeting methods
}
