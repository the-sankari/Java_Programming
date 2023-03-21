package Methods;

public class Method73 {
    private static void hey(){
        System.out.println("Hey!");

    }
    private static void hey(int eAmount){
        if (eAmount > 0) {
            System.out.print("H");
            for (int i = 0; i < eAmount; i++) {
                System.out.print("e");         
            }
            System.out.println("y!");
        }
    }
    private static void hey(int eAmount, int amount){
        if ((eAmount > 0) && (amount > 0)) {
            for (int i = 0; i < amount; i++) {
                hey(eAmount);
            }
        }
    }
    public static void main(String[] args) {
        hey();
        System.out.println("----------------");
        hey(6);
        hey(2);
        System.out.println("----------------");
        hey(3, 4);

    }
}
