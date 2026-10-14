package com.example;

public class SimpleInterest {
    public static double calculate(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }
    public static void main(String[] args) {
        double p = 1000.0;
        double r = 5.0; 
        double t = 2.0; 
        double result = calculate(p, r, t);
        System.out.println("Simple Interest: " + result);
    }
}
