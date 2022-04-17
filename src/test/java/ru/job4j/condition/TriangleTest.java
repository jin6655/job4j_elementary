package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double bc = 3;
        double ac = 4;
        boolean result = Triangle.exist(ab, bc, ac);
        assertTrue(result);
    }

    @Test
    public void whenNoExsist() {
        double ab = 0;
        double bc = 1;
        double ac = 3;
        boolean result = Triangle.exist(ab, bc, ac);
        assertFalse(result);
    }
}