package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixChekTest {

    @Test
    public void  whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixChek.nomoHorixontal(input, row);
        assertTrue(result);
    }

    @Test
    public void  whenNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 2;
        boolean result = MatrixChek.nomoHorixontal(input, row);
        assertFalse(result);
    }
}