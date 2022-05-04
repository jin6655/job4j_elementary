package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX10Y10X22Y20() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX11Y11X22Y22() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double expected = 1.41;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX11Y11X23Y22() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 2);

        double expected = 2.236;
        double out = a.distance(b);
        assertEquals(expected, out, 0.001);
    }

}