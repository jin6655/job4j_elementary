package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1() {
        double p = 4;
        double k = 1;
        double expected = 1;
        double out = SqArea.squares(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.squares(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K1() {
        double p = 8;
        double k = 1;
        double expected = 4;
        double out = SqArea.squares(p, k);
        assertEquals(expected, out, 0.01);
    }
}