package Methods;

public class Method74 {
    private static void typeAndAmoount(int a, int b){
        System.out.println("two perameters: ");
        System.out.println("int a == " + a + "\nint b == " + b);
    }
    private static void typeAndAmoount(String a, int b){
        System.out.println("two parameters: ");
        System.out.println("String a is \"" + a + "\"\nint b == " + b);

    }

    private static void typeAndAmoount(boolean a){
        System.out.println("single parameter: ");
        System.out.println("boolean a == " + a);

    }

    public static void main(String[] args) {
        typeAndAmoount(1 +2, 5 + 4);
        System.out.println("------------");
        typeAndAmoount(4 < 5 && 4 >=4);

        System.out.println("------------");
        typeAndAmoount("character" + " string", 2004);
        System.out.println("------------");
        typeAndAmoount(4 != 4);
        System.out.println("------------");
        typeAndAmoount("mar", 10);
        System.out.println("------------");

    }
}
