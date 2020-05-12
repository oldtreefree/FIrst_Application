package ru.ishchenko.task15;

public class Main {
    public static void main(String[] args) {

        //Создание каталога
        DirectoryCreator.create();
        //Создание файла
        FileManager.fileCreate();
        //Переименование файла
        FileManager.fileRename();
        //Копирование файла
        FileManager.fileCopy();
        //Удаление файла
        FileManager.fileDelete();
        //Рекурсия колотога
        DirectoryCreator.printContent();

    }
}
