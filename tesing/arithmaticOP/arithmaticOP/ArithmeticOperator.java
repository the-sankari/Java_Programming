package arithmaticOP;

public class ArithmeticOperator {
  
    public int add(int a, int b) {
      return a + b;
    }
    
    public int subtract(int a, int b) {
      return a - b;
    }
    
    public int multiply(int a, int b) {
      return a * b;
    }
    
    public double divide(int a, int b) {
      if (b == 0) {
        throw new IllegalArgumentException("Cannot divide by zero!");
      }
      return (double) a / (double) b;
    }
    
    public int modulus(int a, int b) {
      if (b == 0) {
        throw new IllegalArgumentException("Cannot perform modulus operation with zero!");
      }
      return a % b;
    }
  }
  