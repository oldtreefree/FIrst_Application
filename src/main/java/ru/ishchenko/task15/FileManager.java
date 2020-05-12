package ru.ishchenko.task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileManager {


    public static void fileCreate() {

        File file = new File("C:\\task15\\1txt.txt");
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("Файл " + file.getName() + " был создан");
            } else {
                System.out.println("Файл " + file.getName() + " уже существует");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void fileRename() {
        File file = new File("C:\\task15\\1txt.txt");
        File fileRename = new File("C:\\task15\\2txt.txt");
        if (file.renameTo(fileRename)) {
            System.out.println("Файл " + file.getName() + " был переименован в " + fileRename.getName());
        } else {
            System.out.println("Файл не был переименован");
        }
    }

    public static void fileCopy() {
        File file = new File("C:\\task15\\2txt.txt");
        File fileCopy = new File("C:\\task15\\copy_2txt.txt");
        try {
            Files.copy(file.toPath(), fileCopy.toPath());
            System.out.println("Копия файла " + file.getName() + " была создана с названием " + fileCopy.getName());
        } catch (IOException ex) {
            System.out.println("Фаил для копирования не существует");
        }
    }

    public static void fileDelete() {
        File file = new File("C:\\task15\\2txt.txt");
        if (file.delete()) {
            System.out.println("Файл " + file.getName() + " был удален.");
        } else {
            System.out.println("Файл " + file.getName() + " не найден");
        }
    }
}
