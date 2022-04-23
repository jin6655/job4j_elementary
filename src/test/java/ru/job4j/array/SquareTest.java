package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBoundThen014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenBoundThen014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertArrayEquals(expected, result);
    }

}