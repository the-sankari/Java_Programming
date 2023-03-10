package DataTypes;
import java.util.Scanner;

public class Ex7{
    public static void main(String[] args) {

        float timeSeconds, mps, kph, mph;

        Scanner readScanner = new Scanner(System.in);
        
        System.out.print("Enter distance in meters: ");
        float distance = readScanner.nextFloat();

        System.out.print("Enter hour: ");
        float hour = readScanner.nextFloat();

        System.out.print("Enter minuites: ");
        float minuites = readScanner.nextFloat();

        System.out.print("Enter seconds: ");
        float seconds = readScanner.nextFloat();

        timeSeconds = (hour * 3600) + (minuites * 60) + seconds;
        mps = distance / timeSeconds;
        kph = (distance/1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;
        

        System.out.print("Your speed: \n In meter/second = " + mps + " m/s\n In km/h = " + kph + " km/h\nIn miles/hour = " + mph + " M/h");
        readScanner.close();
    }
}
