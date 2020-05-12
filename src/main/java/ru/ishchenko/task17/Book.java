package ru.ishchenko.task17;

public class Book {
    private String name;
    private String author;
    private int age;

    public Book(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +" | " + author + " | " + age;
    }
}
