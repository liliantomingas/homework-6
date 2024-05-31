package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculatorInstance;

    @BeforeEach
    public void setUp(){
        calculatorInstance = new Calculator();
    }

    @Test
    public void addingTwoPositiveValues(){
        Calculator calculatorInstance = new Calculator();
        double actualValue = calculatorInstance.addTwoValues(3, 4);
        assertEquals(7, actualValue);
    }

    @Test
    public void addingTwoNegativeValues(){
        Calculator calculatorInstance = new Calculator();
        double actualValue = calculatorInstance.addTwoValues(-3, -4);
        assertEquals(-7, actualValue);
    }

    @Test
    public void subtractingTwoPositiveValues(){
        Calculator calculatorInstance = new Calculator();
        int actualValue = calculatorInstance.subtractTwoIntegerValues(5, 2);
        assertEquals(3, actualValue);
    }

    @Test
    public void subtractingTwoNegativeValues(){
        Calculator calculatorInstance = new Calculator();
        int actualValue = calculatorInstance.subtractTwoIntegerValues(-5, -2);
        assertEquals(-3, actualValue);
    }

    @Test
    public void firstValueIsGreaterThanSecondValue(){
        Calculator calculatorInstance = new Calculator();
        boolean actualValue = calculatorInstance.isGreater(12, 10);
        assertTrue(actualValue);
    }

    @Test
    public void secondValueIsGreaterThanFirstValue(){
        Calculator calculatorInstance = new Calculator();
        boolean actualValue = calculatorInstance.isGreater(10, 12);
        assertTrue(actualValue);
    }

    @Test
    public void firstValueIsNotGreaterThanSecondValue(){
        Calculator calculatorInstance = new Calculator();
        boolean actualValue = calculatorInstance.isGreater(10, 10);
        assertFalse(actualValue);
    }

}
