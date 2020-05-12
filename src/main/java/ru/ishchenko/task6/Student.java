package ru.ishchenko.task6;

public class Student extends Human {
    String group;
    int time; //Время прибытия на пары. talk()

    public Student(String name, String lastName, int age, String group) {
        super(name, lastName, age);
        this.group = group;
    }

    @Override
    public boolean isStudent() {
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
