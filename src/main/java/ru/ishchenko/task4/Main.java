package ru.ishchenko.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите программу:");
        System.out.println("1: МИНхМАКС");
        System.out.println("2: Отрецательное,положительное");
        System.out.println("3: Табл. умножения");
        System.out.println("4: Ариф,геом прогрессия");
        int a1 = input.nextInt();
        switch (a1) {
            case (1):
                MinAndMax.minAndMax();  // Написать программу для поиска минимального из двух чисел.
                break;
            case (2):
                DiscriptionNumber.discriptionNumber(); //Написать программу, которая описывает введенное число. Отрицательное число или положительное (или нулевое), чётное или нечётное.
                break;
            case (3):
                Table.table(); // Написать программу для вывода на экран таблицы умножения.
                break;
            case (4):
                Progress.progress(); // * Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
                break;
        }

        // * Пример прогрессий:
        //         Первый член прогрессии = 1
        //         Разность прогрессии (знаменатель) = 3
        //         Последний член прогрессии = 15
        //         АРЕФ = 43
        //         ГЕОМ = 4782969
        // Можно проверить тут: https://planetcalc.ru/177/ https://planetcalc.ru/179/

    }

}
