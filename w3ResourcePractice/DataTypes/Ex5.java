package DataTypes;

import java.util.Scanner;

public class Ex5{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
            System.out.print("Input timezone GMT: ");
            long timeZoneChange = readScanner.nextInt();

            long totalMS = System.currentTimeMillis();
            long totalScd = totalMS / 1000;
            long currentSecond = totalScd %60;
            long totalMin = totalScd / 60;
            long currentMin = totalMin % 60;
            long totalHr = totalMin / 60;
            long currentHr = ((totalHr + timeZoneChange) % 24);
        
        System.out.print("Current time is " + currentHr + ":" + currentMin + ":" + currentSecond);
    }
}