package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    
    @Test
    @DisplayName("multiply two numbers")
    public void testmultiply() {
        final Integer reduce = Calculator.multiply(2, 4);

        assertEquals(8, reduce);
}
  
 /**
 * 
 */
@Test
    @DisplayName ("divide two numbers")
    public void testdivide() {
        final Integer deduce = Calculator.divide(4, 2);

        assertEquals(2, deduce);
        //Expected results
}
    
  
}
