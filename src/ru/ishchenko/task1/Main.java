package ru.ishchenko.task1;

import java.util.Scanner;

public class Main {

    private static int MIN = 1, MAX = 20;

    public static void main(String[] args) {

        //Запуск Расчета бензина
        calcGus();
        //Запуск Расчета ЗП с налогом
        calcZp();
        //Запуск Конвертера секунды-часы
        convertTime();
        //Запуск Игры "Горячо-Холодно"
        starter();

    }

    private static void convertTime() {
        // Написать программу, которая конвертирует секунды в часы.
        int sec; // Кол-во секунд

        System.out.println("Введите секунды что бы конвертировать их в часы");

        Scanner input2 = new Scanner(System.in);
        sec = input2.nextInt();

        int m = sec / 60; // Кол-во минут
        int h = m / 60; // Кол-во часов
        System.out.println(sec + " Секунд это " + h + " часов" + "\n");
    }

    private static void calcZp() {
        // Написать программу, которая считает зарплату «на руки».
        double salary; // ЗП без налога
        int tax_percent = 13; // % налога

        System.out.println("Впишите вашу ЗП для расчета «на руки»");

        Scanner input1 = new Scanner(System.in);
        salary = input1.nextInt();

        double tax = salary / 100 * tax_percent;
        double net_salary = salary - tax;
        System.out.println("Зарплата «на руки» составляет = " + net_salary + " рублей." + "\n");
    }

    private static void calcGus() {
        // Написать программу, которая считает стоимость бензина.
        double price = 45.50; // стоимость за литр.
        int liters; // кол-во литров.

        System.out.println("Стоимость бензина за 1 литр составляет = " + price);
        System.out.println("Введите кол-во литров");

        Scanner input = new Scanner(System.in);
        liters = input.nextInt();

        double total = price * liters;
        System.out.println("Стоимость бензина за " + liters + " литра(ов) составляет = " + total + " рублей." + "\n");
    }


    static void starter() {
        start();
        log();
    }

    static void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вам нужно угадать чило от 1 до 20");
        System.out.println("Введите число");
        int i = scan.nextInt();
        check(i);

    }

    static void check(int i) {
        if (i > 20) {
            System.out.println("Вы ввели число больше 20");
            start();
        } else if (i < 1) {
            System.out.println("Вы ввели отрицательное число или 0");
            start();
        }
    }

    static void log() {
        int i = 0;
        int randomNumber = MIN + (int) (Math.random() * MAX);
        while (i != randomNumber) {
            int c = Math.abs(randomNumber - i);
            numToString(c);
            Scanner scan2 = new Scanner(System.in);
            i = scan2.nextInt();
        }
        System.out.println("Правильное число " + randomNumber + ". Победа!!!");
    }

    static void numToString(int c) {
        switch (c) {
            case 1:
                System.out.println("Горячо");
                break;
            case 2:
                System.out.println("Тепло");
                break;
            case 3:
                System.out.println("Холодно");
                break;
            case 4:
                System.out.println("Очень Холодно");
                break;
            default:
                System.out.println("Очень, очень холодно");
                break;
        }
    }
}