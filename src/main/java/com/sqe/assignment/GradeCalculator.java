package com.sqe.assignment;

public class GradeCalculator {
    
    public String getGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }
    
    public double calculatePercentage(int obtained, int total) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total marks must be positive");
        }
        return (obtained * 100.0) / total;
    }
    
    public boolean isPassing(int marks) {
        return marks >= 50;
    }
}