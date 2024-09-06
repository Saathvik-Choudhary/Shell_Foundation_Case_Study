package code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreaterNumberTest {
    @Test
    public void test1_both_positive() {
        int a=212;
        int b=421;
        int expected=421;
        assertEquals(expected, GreaterNumber.greater(a, b));
    }

    @Test
    public void test2_neagative_and_positive() {
        int a=-1241;
        int b=1431;
        int expected=1431;
        assertEquals(expected, GreaterNumber.greater(a, b));
    }

    @Test
    public void test3_both_negative() {
        int a=-1341;
        int b=-321;
        int expected=-321;
        assertEquals(expected, GreaterNumber.greater(a, b));
    }
}