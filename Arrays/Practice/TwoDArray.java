package practice;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoD = new int[5][5];

        twoD[0][0] = 1;
        twoD[1][1] = 1;
        twoD[2][2] = 1;
        twoD[3][3] = 1;
        twoD[4][4] = 1;
        // twoD[5][5] = 1;
        // print the array

        for (int row = 0; row < twoD.length; ++row) {
            for (int colum = 0; colum < twoD[row].length; ++colum) {
                System.out.print(" " + twoD[row][colum]);
            }
            System.out.println();
        }
    }
}
