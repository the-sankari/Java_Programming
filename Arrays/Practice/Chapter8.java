package practice;
import java.util.Scanner;

public class Chapter8 {

    // printer method
    private static void printer(double[] table){
        for (int i = 0; i < table.length; i++) {
            if (i == table.length -1) {
                // print the number and line change 
                System.out.println(table[i]);
            } else {
                // print the number and comma
                System.out.print(table[i] + ", ");
            }
        }
    }

    // average method 

    private static double average(double[] table){
        double sum = 0, average = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }
        average = sum / table.length;

        return average;
    }

    // order method 
    private static void order  (double[] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i] < table[j]) {
                    double tmp = table[i];
                    table[i] = table[j];
                    table[i] = tmp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double[] jumps;
        final  int amount; 
        String name;

        System.out.print("Jumper name: ");
        name = reader.nextLine();

        System.out.print("Amount of jumps: ");
        amount = reader.nextInt();

        // creating array and reference to it in the variable jumps

        jumps = new double[amount];

        for (int i = 0; i < jumps.length; i++) {
            System.out.print("Type in " + (i + 1) + ". jump result: ");
            jumps[i] = reader.nextDouble();
        }

        // order the jumps in desired order 
        order(jumps);

        System.out.println("---------");
        System.out.print(name + "'s jumps form the shortest to longest: ");
        printer(jumps);
        System.out.println("Averager length of the jumps " + average(jumps));

    }
}

// 
