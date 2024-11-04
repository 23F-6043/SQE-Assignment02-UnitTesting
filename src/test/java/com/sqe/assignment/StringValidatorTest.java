package com.sqe.assignment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringValidatorTest {
    
    private StringValidator validator;
    
    @BeforeEach
    void setUp() {
        validator = new StringValidator();
    }
    
    // ECP: Valid email
    @Test
    @Order(1)
    @DisplayName("Test valid email format")
    void testValidEmail() {
        assertTrue(validator.isValidEmail("test@example.com"));
    }
    
    // ECP: Invalid email without @
    @Test
    @Order(2)
    @DisplayName("Test invalid email without @ symbol")
    void testInvalidEmailWithoutAt() {
        assertFalse(validator.isValidEmail("testexample.com"));
    }
    
    // BVA: Null email
    @Test
    @Order(3)
    @DisplayName("Test null email returns false")
    void testNullEmail() {
        assertFalse(validator.isValidEmail(null));
    }
    
    // BVA: Empty email
    @Test
    @Order(4)
    @DisplayName("Test empty email returns false")
    void testEmptyEmail() {
        assertFalse(validator.isValidEmail(""));
    }
    
    // ECP: Valid password
    @Test
    @Order(5)
    @DisplayName("Test valid password with 8+ chars, uppercase and number")
    void testValidPassword() {
        assertTrue(validator.isValidPassword("Password123"));
    }
    
    // ECP: Invalid password - too short
    @Test
    @Order(6)
    @DisplayName("Test password shorter than 8 characters")
    void testPasswordTooShort() {
        assertFalse(validator.isValidPassword("Pass1"));
    }
    
    // ECP: Invalid password - no uppercase
    @Test
    @Order(7)
    @DisplayName("Test password without uppercase letter")
    void testPasswordNoUppercase() {
        assertFalse(validator.isValidPassword("password123"));
    }
    
    // ECP: String reversal
    @Test
    @Order(8)
    @DisplayName("Test string reversal")
    void testReverseString() {
        assertEquals("olleh", validator.reverseString("hello"));
    }
    
    // BVA: Null string reversal
    @Test
    @Order(9)
    @DisplayName("Test reverse of null string")
    void testReverseNullString() {
        assertNull(validator.reverseString(null));
    }
    
    // ECP: Count vowels
    @Test
    @Order(10)
    @DisplayName("Test counting vowels in string")
    void testCountVowels() {
        assertEquals(3, validator.countVowels("hello"));
    }
}