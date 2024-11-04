package com.sqe.assignment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {
    
    private GradeCalculator gradeCalc;
    
    @BeforeEach
    void setUp() {
        gradeCalc = new GradeCalculator();
    }
    
    // ECP: Valid A+ grade
    @Test
    @DisplayName("Test marks 90-100 returns A+")
    void testGradeAPlus() {
        assertEquals("A+", gradeCalc.getGrade(95));
    }
    
    // BVA: Boundary at 90
    @Test
    @DisplayName("Test marks exactly 90 returns A+")
    void testGradeBoundary90() {
        assertEquals("A+", gradeCalc.getGrade(90));
    }
    
    // ECP: Valid A grade
    @Test
    @DisplayName("Test marks 80-89 returns A")
    void testGradeA() {
        assertEquals("A", gradeCalc.getGrade(85));
    }
    
    // ECP: Valid B grade
    @Test
    @DisplayName("Test marks 70-79 returns B")
    void testGradeB() {
        assertEquals("B", gradeCalc.getGrade(75));
    }
    
    // ECP: Valid F grade
    @Test
    @DisplayName("Test marks below 50 returns F")
    void testGradeF() {
        assertEquals("F", gradeCalc.getGrade(40));
    }
    
    // BVA: Invalid marks - negative
    @Test
    @DisplayName("Test negative marks throws exception")
    void testNegativeMarks() {
        assertThrows(IllegalArgumentException.class, () -> {
            gradeCalc.getGrade(-5);
        });
    }
    
    // BVA: Invalid marks - over 100
    @Test
    @DisplayName("Test marks over 100 throws exception")
    void testMarksOver100() {
        assertThrows(IllegalArgumentException.class, () -> {
            gradeCalc.getGrade(105);
        });
    }
    
    // ECP: Percentage calculation
    @Test
    @DisplayName("Test percentage calculation")
    void testCalculatePercentage() {
        assertEquals(80.0, gradeCalc.calculatePercentage(80, 100), 0.01);
    }
    
    // ECP: Passing marks
    @Test
    @DisplayName("Test passing marks returns true")
    void testIsPassingWithPassMarks() {
        assertTrue(gradeCalc.isPassing(60));
    }
    
    // ECP: Failing marks
    @Test
    @DisplayName("Test failing marks returns false")
    void testIsPassingWithFailMarks() {
        assertFalse(gradeCalc.isPassing(40));
    }
}