package ru.ishchenko.task6;

class Human {
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
        if(isStudent()) {
            System.out.println("Студенту " + getLastName() + " " + this.age + " лет");
            return age;
        }
        {
            System.out.println("Преподавателю " + getLastName() + " " + this.age + " лет");
            return age;
        }

    }
}

class Teacher extends Human {
    private String subject;

    @Override
    public boolean isStudent(){
        return false;
    }

    public Teacher(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public String getSubject() {
        System.out.println("Преподаватель "+getLastName()+" препадает предмет "+ this.subject);
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class Student extends Human {

    String group; //название группы
    int time; //Время прибытия на пары

    public Student(String name, String lastName, int age, String group) {
        super(name, lastName, age);
        this.group = group;
    }

    @Override
    public boolean isStudent(){
        return true;
    }

    public void talk() {
        if (time <= 8) {
            System.out.println(getLastName() + ": Я успел на пары");
        } else {
            System.out.println(getLastName() + ": Я опоздал на пары =(");
        }

    }

    public int getTime() {
        System.out.println("Студент " + getLastName() + " " + getName() + " пришел на пары в " + this.time + " часов");
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public String getGroup() {
        System.out.println("Студент " + getLastName() + " " + getName() + " находится в группе " + this.group);
        return group;
    }
}


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", 18, "STV-24-j");
        student.getAge();
        student.setTime(8);
        student.getTime();
        student.talk();
        student.getGroup();

        Teacher teacher = new Teacher("Маргарита", "Ярцева",45);
        teacher.setSubject("Математика");
        teacher.getSubject();
        teacher.getAge();

    }
}

