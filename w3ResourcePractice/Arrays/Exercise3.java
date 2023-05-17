// Print the specific grid

public class Exercise3 {
    public static void main(String[] args) {
        int [][]a = new int[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
