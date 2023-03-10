import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);

        System.out.print("Inter value for inch: ");
        double inch = readScanner.nextDouble();

        double toMeter = inch * 0.0254;

        System.out.println(inch +  " incdh = " + toMeter + " meters.");

        System.out.print("Enter a meter value: ");
        double meter = readScanner.nextDouble();

        double toInch = meter / 0.0254;
        System.out.print(meter + " meters = " + toInch + " inches.");
        
    }
}