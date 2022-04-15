package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static double sumMinusDivide(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double sumAllMath(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + minus(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
        System.out.println("Результат расчёта суммы разницы и деления двух чисел 20 и 40 = " + sumMinusDivide(20, 40));
        System.out.println("Результат суммирования всех значений класса MathFunction = " + sumAllMath(20, 40));
    }
}
