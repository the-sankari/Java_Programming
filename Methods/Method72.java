package Methods;

public class Method72 {
    private static void growAndPrint(int number){
        number +=2;
        System.out.println("growAndPrint: number = " + number);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("main: number = " + number );
        growAndPrint(number);
        System.out.println("main: number = " + number);

    }
}
