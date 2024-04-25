package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void testIsNumeric() {
        assertTrue(Validator.isNumeric("123"));
        assertFalse(Validator.isNumeric("abc"));
        System.out.println("Test case: testIsNumeric passed");
    }

    @Test
    public void testIsInRange() {
        assertTrue(Validator.isInRange(100));
        System.out.println("Test case: testIsInRange passed");
    }

    @Test
    public void testIsValidOperator() {
        assertTrue(Validator.isValidOperator('1'));
        System.out.println("Test case: testIsValidOperator passed");
    }

    @Test
    public void testIsValidDivision() {
        assertTrue(Validator.isValidDivision(5));
        System.out.println("Test case: testIsValidDivision passed");
    }

    @Test
    public void testValidateInput_NonNumeric() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("s");
        });
        System.out.println("Test case: testValidateInput_NonNumeric passed");
        System.out.println("Exception message: " + exception.getMessage());
    }

    @Test
    public void testValidateInput_Numeric() {
        assertDoesNotThrow(() -> {
            Validator.validateInput("432");
        });
        System.out.println("Test case: testValidateInput_Numeric passed");
    }
    
    @Test
    public void testValidateInput_OutOfRangePlus() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("1000000");
        });
        System.out.println("Test case: testValidateInput_OutOfRangePlus passed");
        System.out.println("Exception message: " + exception.getMessage());
    }

    @Test
    public void testValidateInput_OutOfRangeMinus() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("-1000000");
        });
        System.out.println("Test case: testValidateInput_OutOfRangeMinus passed");
        System.out.println("Exception message: " + exception.getMessage());
    }

    @Test
    public void testValidateInput_InRange() {
        assertDoesNotThrow(() -> {
            Validator.validateInput("120");
        });
        System.out.println("Test case: testValidateInput_InRange passed");
    }

    @Test
    public void testValidateOperator_InvalidOperator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('8', 10);
        });
        System.out.println("Test case: testValidateOperator_InvalidOperator passed");
        System.out.println("Exception message: " + exception.getMessage());
    }

    @Test
    public void testValidateOperator_ValidOperator() {
        // This test case should not throw an exception
        Validator.validateOperator('1', 10);
        System.out.println("Test case: testValidateOperator_ValidOperator passed");
    }

    @Test
    public void testValidateOperator_DivisionByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('4', 0);
        });
        System.out.println("Test case: testValidateOperator_DivisionByZero passed");
        System.out.println("Exception message: " + exception.getMessage());
    }

    @Test
    public void testValidateOperator_DivisionByTwo() {
        // This test case should not throw an exception
        Validator.validateOperator('4', 2);
        System.out.println("Test case: testValidateOperator_DivisionByTwo passed");
    }
}
