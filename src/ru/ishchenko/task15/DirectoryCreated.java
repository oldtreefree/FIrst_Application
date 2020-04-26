package ru.ishchenko.task15;

import java.io.File;

public class DirectoryCreated {

    public static void directoryCreated() {

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
