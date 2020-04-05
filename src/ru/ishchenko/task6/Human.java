package ru.ishchenko.task6;

public class Human {
    private String name;
    private String lastName;
    private int age;

    public boolean isStudent() {
        return false;
    }

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        if (isStudent()) {
            System.out.println("Студенту " + getLastName() + " " + this.age + " лет");
            return age;
        }
        {
            System.out.println("Преподавателю " + getLastName() + " " + this.age + " лет");
            return age;
        }

    }
}

