package com.sqe.assignment;

public class StringValidator {
    
    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
    
    public boolean isValidPassword(String password) {
        if (password == null) return false;
        return password.length() >= 8 && 
               password.matches(".*[A-Z].*") && 
               password.matches(".*[0-9].*");
    }
    
    public String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
    
    public int countVowels(String input) {
        if (input == null) return 0;
        return input.toLowerCase().replaceAll("[^aeiou]", "").length();
    }
}