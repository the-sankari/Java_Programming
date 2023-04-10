import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int[][] matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }

    // Method to ask user for matrix element values
    public static int[][] askInfo(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Type in the element " + (j + 1) + " of the row " + (i + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to count the sum of elements in the matrix
    public static void countSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of the elements of the matrix: " + sum);
    }
}
