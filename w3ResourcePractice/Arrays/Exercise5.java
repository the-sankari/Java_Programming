// Test if an array contains a specific value

public class Exercise5 {

    public static boolean contains(int[] arr, int item){
        for(int n: arr){
            if(item == n){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_Array = {
            8764,942,9052,592,5929,
            4857,45982,54902,940982,
            894379,9344,45897,4253
        };

        System.out.println(contains(my_Array, 4857));
        System.out.println(contains(my_Array, 54902));
    }
}


