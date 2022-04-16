package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX10Y10X22Y20() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX11Y11X22Y22() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX11Y11X23Y22() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 2;
        double expected = 2.236;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.001);
    }

}