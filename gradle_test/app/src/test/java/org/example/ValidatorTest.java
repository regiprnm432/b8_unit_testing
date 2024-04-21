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
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("s");
        });
        System.out.println("Test case: testValidateInput_NonNumeric passed");
    }

    @Test
    public void testValidateInput_OutOfRangePlus() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("1000000");
        });
        System.out.println("Test case: testValidateInput_OutOfRange passed");
    }

    public void testValidateInput_OutOfRangeMinus() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("-1000000");
        });
        System.out.println("Test case: testValidateInput_OutOfRange passed");
    }

    @Test
    public void testValidateOperator_InvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('8', 10);
        });
        System.out.println("Test case: testValidateOperator_InvalidOperator passed");
    }

    public void testValidateOperator_validOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('1', 10);
        });
        System.out.println("Test case: testValidateOperator_InvalidOperator passed");
    }

    @Test
    public void testValidateOperator_DivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('4', 0);
        });
        System.out.println("Test case: testValidateOperator_DivisionByZero passed");
    }

    public void testValidateOperator_DivisionByTWo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('4', 2);
        });
        System.out.println("Test case: testValidateOperator_DivisionByTwo passed");
    }
}
