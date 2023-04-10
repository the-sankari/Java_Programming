package exercises;

public class Arrays {
    public static void main(String[] args) {
        // Missing variable definitions and initializations
        
        int[] numberArray = {4, 7, 8, 2, 8, 3, 7, 1}; // Declaration and initialization of numberArray
        
        String[] nameArray = {"May", "Peggy", "Tina", "Sue"}; // Declaration and initialization of nameArray
        
        int[][] matrix = { {2}, {4, 6}, {8, 10, 12}, {14, 16}, {18} }; // Declaration and initialization of matrix
        
        System.out.print("Numbers in array: ");
        for(int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");    
        }
     
        System.out.print("\n\nNames in array: ");
        for(int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");    
        }
 
        System.out.println("\n\nMatrix elements: ");
        for(int i = 0; i < matrix.length; i++) { 
            for(int j = 0; j < matrix[i].length; j++) {   
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\t");    
        }
    }    
}
