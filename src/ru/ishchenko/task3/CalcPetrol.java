package ru.ishchenko.task3;

import java.util.Scanner;

public class CalcPetrol {
    public static void start() {
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
}
