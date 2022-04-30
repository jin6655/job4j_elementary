package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {9, 10, 1, 7, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 7, 8, 9, 10};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {50, 8, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 12, 50};
        assertArrayEquals(expected, result);
    }

}