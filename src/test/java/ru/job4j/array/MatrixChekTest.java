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

    @Test
    public void  whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int row = 2;
        boolean result = MatrixChek.monovertical(input, row);
        assertTrue(result);
    }

    @Test
    public void  whenNoMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int row = 0;
        boolean result = MatrixChek.monovertical(input, row);
        assertFalse(result);
    }

    @Test
    public void  whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] result = MatrixChek.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertArrayEquals(expected, result);
    }

    @Test
    public void  whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'}
        };
        char[] result = MatrixChek.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertArrayEquals(expected, result);
    }

    @Test
    public void  whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        char[] result = MatrixChek.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        assertArrayEquals(expected, result);
    }

}