package arithmaticOP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestingArithmeticOperator {
  
  @Test
  public void testAddition() {
    ArithmeticOperator arithOp = new ArithmeticOperator();
    assertEquals(5, arithOp.add(2, 3));
    assertEquals(-10, arithOp.add(5, -15));
    assertEquals(0, arithOp.add(0, 0));
  }
  
  @Test
  public void testSubtraction() {
    ArithmeticOperator arithOp = new ArithmeticOperator();
    assertEquals(5, arithOp.subtract(10, 5));
    assertEquals(-10, arithOp.subtract(-5, 5));
    assertEquals(0, arithOp.subtract(5, 5));
  }
  
  @Test
  public void testMultiplication() {
    ArithmeticOperator arithOp = new ArithmeticOperator();
    assertEquals(6, arithOp.multiply(2, 3));
    assertEquals(-15, arithOp.multiply(3, -5));
    assertEquals(0, arithOp.multiply(0, 5));
  }
  
  @Test
  public void testDivision() {
    ArithmeticOperator arithOp = new ArithmeticOperator();
    assertEquals(2.5, arithOp.divide(5, 2), 0.0001);
    assertEquals(-3.0, arithOp.divide(-6, 2), 0.0001);
    assertThrows(IllegalArgumentException.class, () -> arithOp.divide(5, 0));
  }
  
  @Test
  public void testModulus() {
    ArithmeticOperator arithOp = new ArithmeticOperator();
    assertEquals(2, arithOp.modulus(7, 5));
    assertEquals(0, arithOp.modulus(6, 3));
    assertThrows(IllegalArgumentException.class, () -> arithOp.modulus(5, 0));
  }
}

