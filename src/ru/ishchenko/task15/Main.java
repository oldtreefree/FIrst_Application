package ru.ishchenko.task15;

public class Main {
    public static void main(String[] args) {

        //Создание каталога
        DirectoryCreated.directoryCreated();
        //Создание файла
        FileManagement.fileCreate();
        //Переименование файла
        FileManagement.fileRename();
        //Копирование файла
        FileManagement.fileCopy();
        //Удаление файла
        FileManagement.fileDelete();
        //Рекурсия колотога
        Recursion.recursion();

    }
}
