package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return ab + bc > ac && ab + ac > bc && bc + ac > ab;
    }

    public static void main(String[] args) {
        System.out.println(exist(2, 3, 4));
        System.out.println(exist(3, 3, 0));
    }
}

