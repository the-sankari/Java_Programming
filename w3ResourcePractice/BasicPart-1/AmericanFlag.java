public class AmericanFlag {
    public static void main(String[] args) {
        String partA = "* * * * * * ==================================\n * * * * *  ==================================";
        String partB = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(partA);        
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(partB);
           }
    }
}
