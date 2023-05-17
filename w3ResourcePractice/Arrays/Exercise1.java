// Sort a numeric array and a string array

import java.util.Arrays;

public class Exercise1{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] my_Array1 = {
            1789, 2035, 1899, 1463, 2013,
            1453, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456
        };

        String[] my_Array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };

        System.out.println("original numeric Array : " + Arrays.toString(my_Array1));
        Arrays.sort(my_Array1);

        System.out.println("Sorted numerci array : " + Arrays.toString(my_Array1));
        
        System.out.println("Original string Array: " + Arrays.toString(my_Array2));
        Arrays.sort(my_Array2);
        System.out.println("Sorted String array: " + Arrays.toString(my_Array2));
    }
}
