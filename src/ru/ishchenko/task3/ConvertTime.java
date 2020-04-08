package ru.ishchenko.task3;

import java.util.Scanner;

public class ConvertTime {
    public static void start() {
        // Написать программу, которая конвертирует секунды в часы.
        int sec; // Кол-во секунд

        System.out.println("Введите секунды что бы конвертировать их в часы");

        Scanner input2 = new Scanner(System.in);
        sec = input2.nextInt();

        int m = sec / 60; // Кол-во минут
        int h = m / 60; // Кол-во часов
        System.out.println(sec + " Секунд это " + h + " часов" + "\n");
    }
}
