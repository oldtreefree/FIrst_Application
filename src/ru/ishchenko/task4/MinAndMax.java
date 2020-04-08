package ru.ishchenko.task4;

import java.util.Scanner;

public class MinAndMax {
    public static void minAndMax() {
        int a, b;
        System.out.println("Программа посчитает вам какое число больше а какое меньше");
        System.out.println("Введите первое число");
        Scanner in1 = new Scanner(System.in);
        a = in1.nextInt();

        System.out.println("Введите второе число");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextInt();

        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (a == b) {
            System.out.println("Первое число равное второму");
        } else {
            System.out.println("Второе число больше первого");
        }
        System.out.println("-------------------------------------");
    }
}
