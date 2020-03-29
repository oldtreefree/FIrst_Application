package ru.ishchenko.task3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Написать программу для поиска минимального из двух чисел.
        minAndMax();
        //Написать программу, которая описывает введенное число. Отрицательное число или положительное (или нулевое), чётное или нечётное.
        discriptionNumber();
        // Написать программу для вывода на экран таблицы умножения.
        table();
        // Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
        // Пример: Первый член прогрессии = 1
        //         Разность прогрессии (знаменатель) = 3
        //         Последний член прогрессии = 15
        //         АРЕФ = 43
        //         ГЕОМ = 4782969
        // Можно проверить тут: https://planetcalc.ru/177/ https://planetcalc.ru/179/
        progress();

    }

    private static void minAndMax() {
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

    private static void discriptionNumber() {
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


    private static void table() {
        System.out.println("Таблица умножения");
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }

    private static void progress() {
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


