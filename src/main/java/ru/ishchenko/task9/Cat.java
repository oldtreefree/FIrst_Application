package ru.ishchenko.task9;

public class Cat extends Animal implements Swim, Run {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStateRun(boolean r) {
        if (r == RUN)
            System.out.println("Бежит");
        else if (r == NOTRUN)
            System.out.println("Не бежит");
        else
            System.out.println("Статус не определен");
    }

    @Override
    public void printStateSwim(boolean s) {
        if (s == SWIM)
            System.out.println("Плывет");
        else if (s == NOTSWIM)
            System.out.println("Не плывет");
        else
            System.out.println("Статус не определен");
    }

    public void display() {
        System.out.printf("Cat name: %s \n", name);
    }
}
