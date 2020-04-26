package ru.ishchenko.task4;

import java.util.Scanner;

public class Progress {
    public static void progress() {
        Scanner input = new Scanner(System.in);
        System.out.println("Программа может посчитать афирмитическую и геометрическую прогрессию");
        System.out.println("Введите первый член прогрессии");
        int a1 = input.nextInt();
        System.out.println("Разность прогрессии (знаменатель)");
        int d = input.nextInt();
        System.out.println("Последний член прогрессии");
        int n = input.nextInt();
        System.out.println("Что будем считать?");
        System.out.println("Введите от 1 или 2");
        System.out.println("1: АРИФ");
        System.out.println("2: ГЕОМ");
        int output = input.nextInt();
        if (output == 1) {
            System.out.println("Ариф. прогрессия:");
            System.out.print(a1 + " ");
            for (int i = 1; i < n; i++) {
                int a3 = a1 + d;
                System.out.print(a3 + " ");
                a1 = a3;
            }
        } else {
            System.out.println("Геом. прогрессия:");
            System.out.print(a1 + " ");
            for (int i = 1; i < n; i++){
                int a3 = a1*d;
                System.out.print(a3 + " ");
                a1 = a3;
            }
        }
    }
}
