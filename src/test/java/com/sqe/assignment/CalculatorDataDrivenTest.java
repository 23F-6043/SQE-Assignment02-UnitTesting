package com.sqe.assignment;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorDataDrivenTest {
    
    private Calculator calculator = new Calculator();
    
    @ParameterizedTest
    @CsvFileSource(resources = "/calculator-test-data.csv", numLinesToSkip = 1)
    void testAdditionWithCSVData(int input1, int input2, int expected) {
        assertEquals(expected, calculator.add(input1, input2));
    }
}