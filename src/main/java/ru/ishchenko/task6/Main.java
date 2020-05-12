package ru.ishchenko.task6;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", 18, "STV-24-j");
        student.getAge();
        student.setTime(8);
        student.getTime();
        student.talk();
        student.getGroup();

        Teacher teacher = new Teacher("Маргарита", "Ярцева", 45);
        teacher.setSubject("Математика");
        teacher.getSubject();
        teacher.getAge();

    }
}

