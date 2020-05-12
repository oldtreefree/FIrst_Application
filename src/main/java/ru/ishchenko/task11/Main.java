package ru.ishchenko.task11;

import java.util.Scanner;

public class Main {
    private final static String BADWORD = "бяка";
    private final static String CENSORSHIP = "*вырезано цензурой*";

    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        String stringOutput = stringInput.nextLine();
        censored(stringOutput);

    }

    public static void censored(String i) {
        System.out.println(i.replace(BADWORD, CENSORSHIP));
    }
}
