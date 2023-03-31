package Arrays.Practice;

public class PerSearch {
    public static void main(String[] args) {
        
    }
    private static int perSearch(int[] arr, int searchedValue){
        // sorting the array begins with the first element
        int ind = 0;
        // worst case is that we have to go through all the elements
        while (ind < arr.length) {
            if (arr[ind] == searchedValue) 
                return ind;     // serch value found, return the index
                ind++;     // was not found, increment index
        }
        return -1;      // reached end, searched value was not in the array
    }
}
