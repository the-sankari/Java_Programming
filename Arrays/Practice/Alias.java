public class Alias{
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        // Original refers to an array which elements have the values 1 - 9
        int[] alias;

        int [] copy;

        copy = copyOfAnArray(original);

        // change the copy 
        for (int i = 0; i < copy.length; ++i) {
            copy[i] *= 3;
        }

        System.out.println("original: ");

        // print original 
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] +  " ");
        }
        System.out.println();

        // print copy 
        System.out.println("Copy: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        System.out.println();

        // alias refers to nothing 
        alias = original;

        // alias and original reger to the same array 
        // change the first element using the variable alias
        alias[6] += 10;

        // change the second elements using orignal 
        for (int i = 0; i < original.length; ++i) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.println("alias: ");

        // print the array elements using alias 
        for (int i = 0; i < alias.length; ++i) {
            System.out.print(alias[i] + " ");

        }
        System.out.println();

    }

    private static int[] copyOfAnArray(int[] ap){
        // copy size set to be the same with orginal 
        int[] copy = new int[ap.length];

        // copying 

        for (int i = 0; i < copy.length; ++i) {
            copy[i] = ap[i];
        }

        // return a reference to copy 
        return copy;
        
    }
}

