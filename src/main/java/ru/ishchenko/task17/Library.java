package ru.ishchenko.task17;

import java.io.*;

public class Library {
    private final String path = "C:\\task17\\library.txt";
    private Book[] books = new Book[50];


    public Library() {
        createDir();
        recovery();
    }

    private void createDir() {
        String dir = "C:\\task17";
        File directory = new File(dir);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public void createLibrary() {
        File file = new File(path);
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("Библиотека создана");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }


    public void createBook(Book book) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.append(book.toString()).append("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void showBooks() {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Список книг в библиотеке: ");
            System.out.println("Название |  Автор  | Год выпуска ");
            for (Book book : books) {
                if (book == null)
                    break;
                System.out.println(book.toString());
            }
        } else {
            System.out.println("Библиотека не существует. Создайте хотя бы одну книгу");
        }
    }

    private void recovery() {
        File file = new File(path);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String s;
                while ((s = br.readLine()) != null) {
                    String[] s1 = s.split("\\|");
                    for (int i = 0; i < books.length; i++) {
                        if (books[i] == null) {
                            books[i] = new Book(s1[0].trim(), s1[1].trim(), Integer.parseInt(s1[2].trim()));
                            break;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Библиотека не существует. Создайте хотя бы одну книгу");
        }
    }
}
