package ru.job4j.condition;

public class Max {
    public static int max(int right, int left) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int res = Max.max(13, 12);
        System.out.println(res);
    }

}
