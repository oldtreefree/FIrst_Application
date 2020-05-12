package ru.ishchenko.task17;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        while (true) {
            System.out.println("1: Показать библиотеку");
            System.out.println("2: Создать книгу");
            System.out.println("3: Выход из программы");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            switch (i) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.createLibrary();
                    System.out.println("Введите название книги");
                    String name = input.next();
                    System.out.println("Введите название автора");
                    String author = input.next();
                    System.out.println("Введите год выпуска");
                    int age = input.nextInt();
                    library.createBook(new Book(name, author, age));
                    break;
                case 3:
                    exit(0);
            }
        }
    }
}
