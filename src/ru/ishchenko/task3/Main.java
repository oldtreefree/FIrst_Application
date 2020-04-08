package ru.ishchenko.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите программу:");
        System.out.println("1: Расчет бензина");
        System.out.println("2: Расчет ЗП с налогом");
        System.out.println("3: Конвертер секунды-часы");
        System.out.println("4: Игра 'Горячо-Холодно'");
        int a1 = input.nextInt();
        switch (a1) {
            case (1):
                CalcPetrol.start();  //Запуск Расчета бензина
                break;
            case (2):
                CalcZp.start(); //Запуск Расчета ЗП с налогом
                break;
            case (3):
                ConvertTime.start(); //Запуск Конвертера секунды-часы
                break;
            case (4):
                HotAndCold.start(); //Запуск Игры "Горячо-Холодно"
                break;
        }
    }
}
