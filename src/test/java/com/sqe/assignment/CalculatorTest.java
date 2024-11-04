package com.sqe.assignment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    // ECP: Valid positive numbers
    @Test
    @Order(1)
    @DisplayName("Test addition with positive numbers")
    void testAddPositiveNumbers() {
        assertEquals(10, calculator.add(5, 5));
    }
    
    // ECP: Negative numbers
    @Test
    @Order(2)
    @DisplayName("Test addition with negative numbers")
    void testAddNegativeNumbers() {
        assertEquals(-10, calculator.add(-5, -5));
    }
    
    // BVA: Zero boundary
    @Test
    @Order(3)
    @DisplayName("Test addition with zero")
    void testAddWithZero() {
        assertEquals(5, calculator.add(5, 0));
    }
    
    // ECP: Valid subtraction
    @Test
    @Order(4)
    @DisplayName("Test subtraction of positive numbers")
    void testSubtractPositiveNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }
    
    // ECP: Multiplication
    @Test
    @Order(5)
    @DisplayName("Test multiplication of positive numbers")
    void testMultiplyPositiveNumbers() {
        assertEquals(25, calculator.multiply(5, 5));
    }
    
    // ECP: Valid division
    @Test
    @Order(6)
    @DisplayName("Test division of positive numbers")
    void testDividePositiveNumbers() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }
    
    // BVA: Division by zero
    @Test
    @Order(7)
    @DisplayName("Test division by zero throws exception")
    void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
    
    // ECP: Even number check
    @Test
    @Order(8)
    @DisplayName("Test even number identification")
    void testIsEvenWithEvenNumber() {
        assertTrue(calculator.isEven(4));
    }
    
    // ECP: Odd number check
    @Test
    @Order(9)
    @DisplayName("Test odd number identification")
    void testIsEvenWithOddNumber() {
        assertFalse(calculator.isEven(5));
    }
    
    // BVA: Zero is even
    @Test
    @Order(10)
    @DisplayName("Test zero is even")
    void testIsEvenWithZero() {
        assertTrue(calculator.isEven(0));
    }
}