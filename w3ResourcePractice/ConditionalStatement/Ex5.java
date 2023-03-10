package ConditionalStatement;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int numberOfDay = readScanner.nextInt();

        System.out.print(getDayName(numberOfDay));

    }
    public static String getDayName(int day) {
        String dayName = "";

        switch(day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid day range";
        }
        return dayName;
    }
}
