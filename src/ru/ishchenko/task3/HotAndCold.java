package ru.ishchenko.task3;

import java.util.Scanner;


public class HotAndCold {

    private static int MIN = 1, MAX = 100;

    static void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вам нужно угадать число от" + MIN + " до " + MAX);
        System.out.println("Что бы выйти из игры введите 0 или отрецательное число");
        System.out.println("Введите число");
        int i = scan.nextInt();
        check(i);
        logic(i);
    }


    static void check(int i) {
        if (i > MAX) {
            System.out.println("Вы ввели число больше " + MAX);
            start();
        } else if (i < MIN) {
            System.out.println("Вы ввели отрицательное число или 0");
            System.out.println("Вы вышли из игры.");
            System.exit(0);
        }
    }

    static void logic(int i) {
        int s = i;
        int d = 0;
        int randomNumber = MIN + (int) (Math.random() * MAX);
        while (s != randomNumber) {
            int dif1 = Math.abs(randomNumber - d);
            int dif2 = Math.abs(randomNumber - s);
            d = s;
            if (dif2 < dif1) {
                System.out.println("горячо");
            } else {
                System.out.println("холодно");
            }

            Scanner scan2 = new Scanner(System.in);
            s = scan2.nextInt();
            check(s);
        }
        System.out.println("Вы угадали!!!! Правильный ответ: " + randomNumber);
    }
}