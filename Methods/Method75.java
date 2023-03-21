package Methods;
import java.util.Scanner;
public class Method75 {
    private static String changeThousands(int t){
        if (t == 1) {
            return "thousand";
        } else {
            String cs = changeOnes(t);
            cs += "thousand";
            return cs;
        }
    }
    private static String changeHundreds(int s){
        if (s == 1) {
            return "hundred";
        } else {
            String cs = changeOnes(s);
            cs += "hundred";
            return cs;
        }
    }
    private static String changeOnes(int y){
        switch(y){
            case 1: return " one";
            case 2: return " two";
            case 3: return " three";
            case 4: return " four";
            case 5: return " five";
            case 6: return " six";
            case 7: return " seven";
            case 8: return " eight";
            case 9: return " nine";
            default: return "error";
        }
    }

    private static String changeTenAndOnes(int k){
        String numberCs = "";
        if (k >=  20) {
            if (k / 10 != 0) {
                numberCs += changeOnes(k / 10);
                numberCs += "tens";
            }
            if (k % 10 != 0) {
                numberCs += changeOnes(k % 10);

            }else if (k < 20 && k > 10) {
                numberCs += changeOnes(k % 10);
                numberCs += "teen";
                
            }else if (k == 10) {
                return "ten";
            }else{
                numberCs += changeOnes(k);
            }
            
        }
        return numberCs;
    }

    private static String numberToString(int number){
        String numberCs = "";
        if (number > 0 && number <= 9999) {
            int thousands = number / 1000;
            if (thousands != 0) {
                numberCs += changeThousands(thousands);
                
            }
            int hundreds = (number % 1000) / 100;
            if (hundreds != 0) {
                numberCs += changeHundreds(hundreds);
            }
            int tao = (number % 100);
            if (tao != 0) {
                numberCs += changeTenAndOnes(tao);
            }
        }else if (number == 0) {
            numberCs += "zero";
        }else{
            numberCs += numberCs;
        }
        return numberCs;
    }
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
		String info = "o- - - - - - - -\n" +
			"| Program creates a character string from a positive integer\n" +
			"| Numbers bigger than 9999 are not changed.\n" +
			"| End program by typing a negative integer.\n" +
			"o- - - - - - - -\n";
        int number;
        System.out.println(info);

        do {
            System.out.println("Type in number: ");
            number = reader.nextInt();
            if (number < 0) {
                System.out.println("Nice doing business with you!");
            } else {
                System.out.println(number + " --> " + numberToString(number));
            }
            
        } while (number >= 0);
        // reader.close();

    }
}
