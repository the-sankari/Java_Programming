import java.util.*;
public class RevisonExercise {
    public static void main(String[] args) {
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfnumbers = askInfo(tempArray);

        int[] realArray = new int[amountOfnumbers];
        copyInfo(realArray, tempArray);
        setArray(realArray);
        printArray(realArray);
    }
    public static int askInfo(int[] array){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.print((count + 1) + ". number: ");
            int number = scanner.nextInt();

            if(number == 0){
                break;
            }

            array[count] = number;
            count++;
            if(count == array.length){
                break;
            }
        }
        return count;
    }

    public static void copyInfo(int[] destArray, int[] srcArray){
        for (int i = 0; i < destArray.length; i++) {
            destArray[i] = srcArray[i];
        }
    }

    public static void setArray(int[] array){
        Arrays.sort(array);
        reverseArray(array);
    }

    public static void reverseArray(int[] array){
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;

            left++;
            right--;
        }

    }

    public static void printArray(int[] realArray){
        System.out.println("\nOrdered Array");
        for (int i = 0; i < realArray.length; i++) {
            System.out.println(realArray[i]);
        }
    }
}
