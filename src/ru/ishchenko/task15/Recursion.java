package ru.ishchenko.task15;

import java.io.File;

public class Recursion {
    public static void recursion() {
        File dir = new File("C:\\task15");
        System.out.println("-------------------------------");
        System.out.println("Содержимое каталога " + dir);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory())
                    System.out.println("Папка " + item.getName());
                else
                    System.out.println("Файл " + item.getName() + "\t Размер файла " + item.length());
            }
        }
    }
}
