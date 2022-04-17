package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является чётным.";
        } else if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является чётным.";
        } else {
            rsl = "Исходное число не делится на 3  и не является чётным";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String result = DivideBySix.checkNumber(7);
        System.out.println(result);
    }

}