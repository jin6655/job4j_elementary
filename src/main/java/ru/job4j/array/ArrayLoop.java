package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] al = new int[5];
        for (int i = 0; i < al.length; i++) {
            al[i] = i * 2 + 3;
        }
        for (int number : al) {
            System.out.println(number);
        }
    }
}
