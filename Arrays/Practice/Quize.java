package practice;

public class Quize {
    public static void main(String[] args) {
//         int[] intArray = { 10, 9, 8, 7, 6, 5 };

// System.out.print(intArray.length);
// int[] intArray = { 10, 9, 8, 7, 6, 5 };

// System.out.print(intArray.length);
// int[][] intArray = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

// System.out.print(intArray[2][1]);
// int[] intArray = {3, 5, 4, 1, 9, 6, 8, 2, 0 ,7};

 

// for(int i = 0; i < intArray.length-1; i++) {

//     for(int j = i + 1; j < intArray.length; j++) { 

//         if(intArray [i] < intArray [j]) { 

//             int temp = intArray [i]; 

//             intArray[i] = intArray[j];

//             intArray [j] = temp;

//         }

//     }

//     System.out.print(intArray [i] + " ");

// }

// System.out.print(intArray [intArray.length-1]);
int[] first = {1, 2, 3, 4};

       int[] second  = {5, 6, 7, 8};

       

       System.out.print(second [2]);

       System.out.print(first [0]);

       

       int[] third;

       

       third = second;

       second = first;

       first = third;

       

       System.out.print(third [0]);

       System.out.print(third [0]);

       System.out.print(second [0]);

       System.out.print(first [2]);
    }
}
