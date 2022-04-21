package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }
}