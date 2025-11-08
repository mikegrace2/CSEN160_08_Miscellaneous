import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.csen160.F_JUnit.SalaryCalculator;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {
    @Test
    public void testCalculateSalary_ValidInputs() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertEquals(55000, calculator.calculateSalary(50000, 5000), 0.001);
        assertEquals(40000, calculator.calculateSalary(40000, 0), 0.001);
        assertEquals(3000, calculator.calculateSalary(0, 3000), 0.001);
        assertEquals(0, calculator.calculateSalary(0, 0), 0.001);
    }

    @Test
    public void testCalculateSalary_NegativeBase_Throws() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateSalary(-1000, 500));
    }

    @Test
    public void testCalculateSalary_NegativeBonus_Throws() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateSalary(1000, -500));
    }

    @Test
    public void testCalculateSalary_BothNegative_Throws() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateSalary(-100, -200));
    }

    @Test
    public void testCalculateSalary_LargeValues() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertEquals(3e12, calculator.calculateSalary(1e12, 2e12), 0.001);
    }

    @Test
    public void testCalculateSalary_DecimalValues() {
        SalaryCalculator calculator = new SalaryCalculator();
        assertEquals(1313.46, calculator.calculateSalary(1234.56, 78.90), 0.001);
    }
}

