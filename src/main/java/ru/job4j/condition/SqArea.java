package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = h * l;
        return rsl;
    }

    public static double squares(double p, double k) {
        double rsl = Math.pow((p / (2 * (k + 1))), 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
        System.out.println("p = 6, k = 2, s = 2, real = " + result2);
        double result3 = SqArea.squares(4, 1);
        double result4 = SqArea.squares(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + result3);
        System.out.println("p = 6, k = 2, s = 2, real = " + result4);
    }

}
