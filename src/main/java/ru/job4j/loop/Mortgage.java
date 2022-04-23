package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double i = 0;
        while (i <= amount) {
            year = year + 1;
            amount += amount * (1 + percent * 0.01) - salary;
            i = i + salary;
        }
        return year;
    }
}
