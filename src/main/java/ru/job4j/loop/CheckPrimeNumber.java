package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean chek(int number) {
        boolean prime = false;
    for (int i = 1; i < number; i++) {
        if (i == 1) {
            prime = true;
        } else if (number % i == 0) {
            prime = false;
         break;
        }
    }
    return prime;
    }

}
