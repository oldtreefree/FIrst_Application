package ru.ishchenko.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char n = '\n';

        // Написать программу, которая считает стоимость бензина.
        double price = 45.50; // стоимость за литр.
        int liters; // кол-во литров.

        System.out.println("Стоимость бензина за 1 литр составляет = "+ price);
        System.out.println("Введите кол-во литров");

        Scanner in = new Scanner(System.in);
        liters = in.nextInt();

        double total = price * liters;
        System.out.println("Стоимость бензина за "+ liters +" литра(ов) составляет = "+ total +" рублей."+ n );

        // Написать программу, которая считает зарплату «на руки».
        double salary; // ЗП без налога
        int tax_percent = 13; // % налога

        System.out.println("Впишите вашу ЗП для расчета «на руки»");

        Scanner in2 = new Scanner(System.in);
        salary = in2.nextInt();

        double tax = salary / 100 * tax_percent;
        double net_salary = salary - tax;
        System.out.println("Зарплата «на руки» составляет = "+ net_salary +" рублей."+ n );

        // Написать программу, которая конвертирует секунды в часы.
        int sec; // Кол-во секунд

        System.out.println("Введите секунды что бы конвертировать их в часы");

        Scanner in3 = new Scanner(System.in);
        sec = in3.nextInt();

        int m = sec / 60; // Кол-во минут
        int h = m / 60; // Кол-во часов
        System.out.println(sec +" Секунд это "+ h +" часов");

    }
}
