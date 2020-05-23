package ru.ishchenko.task21_2;


public class Main {
    public static void main(String[] args) {
        System.out.println("Созданый массив");
        int[] a = ArrayUtil.createArray(1, 10);
        System.out.println("Измененный");
        ArrayUtil.revert(a);
    }
}
