package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft12Right10() {
       int left = 12;
       int right = 10;
       int expected = 12;
       int out = Max.max(left, right);
       assertEquals(expected, out);
    }

    @Test
    public void whenLeft10Right13() {
        int left = 10;
        int right = 13;
        int expected = 13;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }

    @Test
    public void whenLeft7Right7() {
        int left = 7;
        int right = 7;
        int expected = 7;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }
}