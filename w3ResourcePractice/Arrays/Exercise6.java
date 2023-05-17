public class Exercise6 {

    public static int findIndex(int[] my_Array, int t) {
        if (my_Array == null)
            return -1;
        int len = my_Array.length;
        // for (int i = 0; i < len; i++) {
        // if (my_Array[i] == t) return i;
        // }
        int i = 0;
        while (i < len) {
            if (my_Array[i] == t)
                return i;
            else
                i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_Array = { 23, 14, 56, 34, 23, 54, 66, 75, 34, 26, 55 };
        System.out.println("Index position is: " + findIndex(my_Array, 34));
        System.out.println("Index position is: " + findIndex(my_Array, 66));
    }
}
