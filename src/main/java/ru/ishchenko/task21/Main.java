package ru.ishchenko.task21;

public class Main {
    public static void main(String[] args) {
        System.out.println("Созданый массив");
        int[][] a = ArrayUtil.createArray(0, 10);
        System.out.println("Измененный");
        ArrayUtil.toLeft(a);
    }
}
