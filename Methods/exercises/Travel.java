package Methods.exercises;
import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        double speed, distance, time;
        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);
        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }
    private static Scanner reader = new Scanner(System.in);
    private static double askDistance(){
        System.out.print("Type in the length of the trip (km): ");
        double distance = reader.nextDouble();
        return distance;
    }
    private static double askSpeed(){
        System.out.print("Type in your average speed (km/h): ");
        double speed = reader.nextDouble();
        return speed;
    }
    private static double countTime(double distance, double speed){
        double time = distance / speed;
        return time;
    }
}
