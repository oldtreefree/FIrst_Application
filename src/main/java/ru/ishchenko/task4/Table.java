package ru.ishchenko.task4;

public class Table {
    public static void table() {
        System.out.println("Таблица умножения");
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }
}
