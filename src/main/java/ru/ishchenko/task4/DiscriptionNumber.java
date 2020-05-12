package ru.ishchenko.task4;

import java.util.Scanner;

public class DiscriptionNumber {
    public static void discriptionNumber() {
        int e;
        System.out.println("Программа, которая описывает введенное число. Отрицательное число или положительное (или нулевое), чётное или нечётное");
        System.out.println("Введите число");
        Scanner in3 = new Scanner(System.in);
        e = in3.nextInt();

        if (e < 0) {
            System.out.println("Число отрицательное");
        } else if (e == 0) {
            System.out.println("Число равное нулю");
        } else {
            System.out.println("Число положительно");
        }
        if (e % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
        System.out.println("-------------------------------------");
    }
}
