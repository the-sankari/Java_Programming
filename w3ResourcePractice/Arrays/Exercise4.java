// Calculate the average value of array elements

import javax.swing.text.html.FormView;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        // Calculate sum of all array elements
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        // calculate average value
        double  average = sum / numbers.length;
        System.out.println("Average value of the array elements is: " + average);
    }
}
