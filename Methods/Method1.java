package Methods;

public class Method1 {

    // calling multiple methods

    private static void foo() {
        System.out.println("Begin foo");
        bar();
        System.out.println("Last sentance of method foo");
    }
    private static void bar() {
        System.out.println("Begin bar");
        fooBar();
        System.out.println("Last sentence of method bar");
        
    }
    private static void fooBar() {
        System.out.println("Begin of method fooBar");
        System.out.println("Last sentence of method fooBar");
    }
    public static void main(String[] args) {
        System.out.println("Call for foo() in main method");
        foo();
        System.out.println("---");

        System.out.println("Call for bar() in main method");
        bar();

    }












    // private static void hey(int amount){
    //     if (amount <= 0) 
    //         return;
    //         for (int i = 0; i < amount; i++) {
                
    //             System.out.println("Hello World!");
    //         }
    // }
    // public static void main(String[] args) {
    //     hey(4);
    // }
}
