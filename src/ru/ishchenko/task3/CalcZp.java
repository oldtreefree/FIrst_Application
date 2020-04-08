package ru.ishchenko.task3;

import java.util.Scanner;

public class CalcZp {
    public static void start() {
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
}
