package ru.ishchenko.task6;

public class Teacher extends Human {
    private String subject;

    @Override
    public boolean isStudent() {
        return false;
    }

    public Teacher(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public String getSubject() {
        System.out.println("Преподаватель " + getLastName() + " преподает предмет " + this.subject);
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
