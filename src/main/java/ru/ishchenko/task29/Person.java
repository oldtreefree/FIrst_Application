package ru.ishchenko.task29;

import java.util.Objects;

public class Person {
    private int age;
    private String lastName;
    private Sex sex;


    public Person(int age, String lastName, Sex sex) {
        this.age = age;
        this.lastName = lastName;
        this.sex = sex;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(lastName, person.lastName) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, lastName, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }
}

