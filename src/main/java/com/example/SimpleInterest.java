package com.example;

public class SimpleInterest {
    public static double calculate(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be non-negative.");
        }
        return (principal * rate * time) / 100.0;
    }
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0; 
        double time = 2.0; 
        double result = calculate(principal, rate, time);
        System.out.println("Simple Interest: " + result);
    }
}
