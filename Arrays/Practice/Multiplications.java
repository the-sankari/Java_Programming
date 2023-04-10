package practice;

public class Multiplications {
    public static void main(String[] args) {
        int[][] multiChart = new int[10][10];

        // calculate the multiplication charts 
        for (int row = 0; row < multiChart.length; ++row) {
            // row
            for (int columns = 0; columns < multiChart[row].length; ++columns) {
                // columns 
                // handling a  single element
                multiChart[row][columns] = (row + 1) * (columns + 1);
            }
        }

        // print the array elements on screen
        for (int row = 0; row < multiChart.length; ++row) {
            for (int columns = 0; columns < multiChart[row].length; columns++) {
                if (multiChart[row][columns] < 10) {
                    System.out.print(" " + multiChart[row][columns]);
                } 
                else if(multiChart[row][columns] >= 10){
                    System.out.print(" " + multiChart[row][columns]);
                }
                else{
                    System.out.print(" " + multiChart[row][columns]);
                }
            }
            // line change after each row
            System.out.println();
        }
    }
}
