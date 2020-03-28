package ru.ishchenko.task1;

import java.util.Scanner;


public class Main {

    private static int min = 1, max = 20, i, c;


    public static void main(String[] args) {

        // Написать программу, которая считает стоимость бензина.
        double price = 45.50; // стоимость за литр.
        int liters; // кол-во литров.

        System.out.println("Стоимость бензина за 1 литр составляет = " + price);
        System.out.println("Введите кол-во литров");

        Scanner in = new Scanner(System.in);
        liters = in.nextInt();

        double total = price * liters;
        System.out.println("Стоимость бензина за " + liters + " литра(ов) составляет = " + total + " рублей.");

        // Написать программу, которая считает зарплату «на руки».
        double salary; // ЗП без налога
        int tax_percent = 13; // % налога

        System.out.println("Впишите вашу ЗП для расчета «на руки»");

        Scanner in2 = new Scanner(System.in);
        salary = in2.nextInt();

        double tax = salary / 100 * tax_percent;
        double net_salary = salary - tax;
        System.out.println("Зарплата «на руки» составляет = " + net_salary + " рублей.");

        // Написать программу, которая конвертирует секунды в часы.
        int sec; // Кол-во секунд

        System.out.println("Введите секунды что бы конвертировать их в часы");

        Scanner in3 = new Scanner(System.in);
        sec = in3.nextInt();

        int m = sec / 60; // Кол-во минут
        int h = m / 60; // Кол-во часов
        System.out.println(sec + " Секунд это " + h + " часов");

        //////////////////////////////////////////////////// Горячо лоходно
        Starter();

    }


    static void Starter() {
        Start();
        Log();
    }

    static void Start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вам нужно угадать чило от 1 до 20");
        System.out.println("Введите число");
        int i = scan.nextInt();
        Check1(i);


    }

    static void Check1(int i) {
        if (i > 20) {
            System.out.println("Вы ввели число больше 20");
            Start();
        } else if (i < 1) {
            System.out.println("Вы ввели отрицательное число или 0");
            Start();
        }
    }

    static void Log() {
        int randomNumber = min + (int) (Math.random() * max);
        while (i != randomNumber) {
            c = Math.abs(randomNumber - i);
            Check(c);
            Scanner scan2 = new Scanner(System.in);
            i = scan2.nextInt();
        }
        System.out.println("Победа");
    }

    static void Check(int c) {
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
