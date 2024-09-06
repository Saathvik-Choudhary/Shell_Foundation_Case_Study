package code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {

    @Test
    public void test_positive_number() {
        int number = 12345;
        int expectedDigits = 5;
        assertEquals(expectedDigits, CountDigits.countDigits(number));
    }

    @Test
    public void test_negative_number() {
        int number = -9876;
        int expectedDigits = 4;
        assertEquals(expectedDigits, CountDigits.countDigits(number));
    }

    @Test
    public void test_single_digit() {
        int number = 5;
        int expectedDigits = 1;
        assertEquals(expectedDigits, CountDigits.countDigits(number));
    }

    @Test
    public void test_Zero() {
        int number = 0;
        int expectedDigits = 1; // Zero has one digit
        assertEquals(expectedDigits, CountDigits.countDigits(number));
    }
}