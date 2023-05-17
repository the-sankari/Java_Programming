// Sum values of an array

public class Exercise2 {
    public static void main(String[] args) {
        int my_Array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for(int i : my_Array)
        sum += i;
        System.out.println("The sum is " + sum);
    }
}
