package ru.ishchenko.task11;

import java.util.Scanner;

public class Main {
    private final static String S1 = "бяка";
    private final static String S2 = "*вырезано цензурой*" ;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        censored(s1);

    }

    public static void censored(String i){
        System.out.println(i.replace(S1, S2));
    }
}
