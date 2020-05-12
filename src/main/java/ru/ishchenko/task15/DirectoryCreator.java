package ru.ishchenko.task15;

import java.io.File;

public class DirectoryCreator {

    public static void printContent() {
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

    public static void create() {
        File directory = new File("C:\\task15");
        File directory2 = new File("C:\\task15\\1");

        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Каталог " + directory.getName() + " был создан");
        } else
            System.out.println("Каталог " + directory.getName() + " уже существует");

        if (!directory2.exists()) {
            directory2.mkdir();
            System.out.println("Каталог " + directory2.getName() + " был создан");
        } else
            System.out.println("Каталог " + directory2.getName() + " уже существует");
    }
}
