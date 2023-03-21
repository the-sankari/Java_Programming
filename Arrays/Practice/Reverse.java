package Arrays.Practice;

public class Reverse {
    public static void main(String[] args) {
        
        String[] numbers = {"one", "two", "three", "four", "five"};
        
      for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
      }
      System.out.println("--------------");
      for (int i = numbers.length -1; i >= 0; i--) {
        System.out.println(numbers[i]);
        
      }
    }
}