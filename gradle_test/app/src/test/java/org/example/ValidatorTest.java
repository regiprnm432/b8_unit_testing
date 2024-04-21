package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void testIsNumeric() {
        assertTrue(Validator.isNumeric("123"));
        assertTrue(Validator.isNumeric("-456"));
        assertFalse(Validator.isNumeric("abc"));
        assertTrue(Validator.isNumeric("12.34"));
        System.out.println("Test case: testIsNumeric passed");
    }

    @Test
    public void testIsInRange() {
        assertTrue(Validator.isInRange(100));
        assertTrue(Validator.isInRange(-200));
        assertFalse(Validator.isInRange(40000));
        assertFalse(Validator.isInRange(-40000));
        System.out.println("Test case: testIsInRange passed");
    }

    @Test
    public void testIsValidOperator() {
        assertTrue(Validator.isValidOperator('1'));
        assertTrue(Validator.isValidOperator('4'));
        assertFalse(Validator.isValidOperator('5'));
        assertFalse(Validator.isValidOperator('a'));
        System.out.println("Test case: testIsValidOperator passed");
    }

    @Test
    public void testIsValidDivision() {
        assertTrue(Validator.isValidDivision(5));
        assertFalse(Validator.isValidDivision(0));
        System.out.println("Test case: testIsValidDivision passed");
    }

    @Test
    public void testValidateInput_NonNumeric() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("abc");
        });
        System.out.println("Test case: testValidateInput_NonNumeric passed");
    }

    @Test
    public void testValidateInput_OutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateInput("40000000000000");
        });
        System.out.println("Test case: testValidateInput_OutOfRange passed");
    }

    @Test
    public void testValidateOperator_InvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateOperator('5', 10);
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
}
