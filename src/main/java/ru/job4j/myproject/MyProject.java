package ru.job4j.myproject;

public class MyProject {

    public static int formula(int a, int b, int c) {
        int[] massiv = new int[10];
        massiv[3] = 4;
        massiv[0] = 2;
        return (a + b + c + massiv[3]) * massiv[0];
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        int resultFormula = MyProject.formula(2, 2, 2);
        System.out.println("Итоги расчётов: " + resultFormula);
    }

}
