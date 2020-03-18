package com.company;

public class Main {

    public static void main(String[] args) {
        // Написать программу, которая считает стоимость бензина.
        double price = 45.50; // стоимость за литр.
        int liters = 4; // кол-во литров.
        double total = price * liters;
        System.out.println("Стоимость бензина за "+ liters +" литра(ов) составляет = "+ total +" рублей." );

        // Написать программу, которая считает зарплату «на руки».
        double salary = 40000.00; // ЗП без налога
        int tax_percent = 13; // % налога
        double tax = salary / 100 * 13;
        double net_salary = salary - tax;
        System.out.println("Зарплата «на руки» составляет = "+ net_salary +" рублей.");

        // Написать программу, которая конвертирует секунды в часы.
        // Сделал в int, потому что нас еще не учили отделять до и после запятой =)
        int sec = 50000; // Кол-во секунд
        int m = 50000 / 60; // Кол-во минут
        int h = m / 60; // Кол-во часов
        System.out.println(h);

    }
}
