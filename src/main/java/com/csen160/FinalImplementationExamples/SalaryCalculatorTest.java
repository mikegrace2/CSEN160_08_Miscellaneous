package com.csen160.FinalImplementationExamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SalaryCalculatorTest {
    @Test
    public void testCalculateSalary_ValidInputs() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertEquals(55000, calculator.calculateSalary(50000, 5000), 0.001);
        assertEquals(40000, calculator.calculateSalary(40000, 0), 0.001);
        assertEquals(3000, calculator.calculateSalary(0, 3000), 0.001);
        assertEquals(0, calculator.calculateSalary(0, 0), 0.001);
    }
}

