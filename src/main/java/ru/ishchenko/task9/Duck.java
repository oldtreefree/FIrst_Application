package ru.ishchenko.task9;

public class Duck extends Animal implements Fly, Swim, Run {

    @Override
    public String getName() {
        return "Это утка";
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

    @Override

    public void printStateFly(boolean f) {
        if (f == FLY)
            System.out.println("Плывет");
        else if (f == NOTFLY)
            System.out.println("Не плывет");
        else
            System.out.println("Статус не определен");
    }
}
