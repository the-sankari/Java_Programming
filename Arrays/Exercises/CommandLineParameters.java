package exercises;

public class CommandLineParameters {
    public static void main(String[] args) {
        int numParameters = args.length;
        System.out.println("You gave " + numParameters + " command line parameter(s).");

        if (numParameters > 0) {
            System.out.println("Below are the given parameters:");
            for (int i = 0; i < numParameters; i++) {
                System.out.println((i + 1) + ". parameter: " + args[i]);
            }
        }
    }
}

s