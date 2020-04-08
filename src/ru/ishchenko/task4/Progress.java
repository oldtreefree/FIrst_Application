package ru.ishchenko.task4;

import java.util.Scanner;

public class Progress {
    public static void progress() {
        Scanner input = new Scanner(System.in);
        System.out.println("Программа может посчитать афермитическую и геометрическую прогрессию");
        System.out.println("Введите первый член прогрессии");
        int a1 = input.nextInt();
        System.out.println("Разность прогрессии (знаменатель)");
        int d = input.nextInt();
        System.out.println("Последний член прогрессии");
        int n = input.nextInt();
        System.out.println("Что будем считать?");
        System.out.println("Введите от 1 или 2");
        System.out.println("1: АРЕФ");
        System.out.println("2: ГЕОМ");
        int output = input.nextInt();
        if (output == 1) {
            System.out.println("Арефмитическая прогрессия: " + (a1 + d * (n - 1)));
        } else {
            System.out.println("Геометрическая прогрессия: " + (a1 * Math.pow(d, n - 1)));
        }
        System.out.println("-------------------------------------");
    }
}
