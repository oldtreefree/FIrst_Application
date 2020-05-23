package ru.ishchenko.task22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("Олег", 15);
        person[2] = new Person("Вася", 15);
        person[1] = new Person("Олег", 12);

        System.out.println(Arrays.toString(person));
        Arrays.sort(person, new PersonSuperComparator());
        System.out.println(Arrays.toString(person));

    }
}
