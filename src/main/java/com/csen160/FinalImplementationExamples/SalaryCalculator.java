package com.csen160.FinalImplementationExamples;

public class SalaryCalculator {
    public double calculateSalary(double baseSalary, double bonus) {
        if (baseSalary < 0 || bonus < 0) {
            throw new IllegalArgumentException("Base salary and bonus must be non-negative");
        }
        return baseSalary + bonus;
    }
}