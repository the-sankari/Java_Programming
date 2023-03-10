package ConditionalStatement;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        int number_of_monthInMonth = 0;
        String monthName = "Unknown";
        System.out.print("Enter number of month: ");
        int month = readScanner.nextInt();
        System.out.print("Enter a year: ");
        int year = readScanner.nextInt();

        switch(month){
            case 1: monthName = "January";
            number_of_monthInMonth = 31;
            break;
            case 2: monthName = "February";
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                number_of_monthInMonth = 29;
            } else {
                number_of_monthInMonth = 28;                
            }
            break;
            case 3: monthName = "March";
            number_of_monthInMonth = 31;
            break;
            case 4: monthName = "April";
            number_of_monthInMonth = 30;
            break;

            case 5: monthName = "May";
            number_of_monthInMonth = 31;
            break;

            case 6: monthName = "June";
            number_of_monthInMonth = 30;
            break;
            case 7: monthName = "July";
            number_of_monthInMonth = 31;
            break;

            case 8: monthName = "August";
            number_of_monthInMonth = 31;
            break;

            case 9: monthName = "September";
            number_of_monthInMonth = 30;
            break;

            case 10: monthName = "October";
            number_of_monthInMonth = 31;
            break;

            case 11: monthName = "November";
            number_of_monthInMonth = 30;
            break;

            case 12: monthName = "December";
            number_of_monthInMonth = 31;
            break;
          
        }
        System.out.print(monthName + " " + year + " has " + number_of_monthInMonth + " days\n");

    }
}
