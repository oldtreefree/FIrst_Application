package ru.ishchenko.task9;

abstract class Human implements Run, Swim {

    private String name;

    public Human(String name) {
        this.name = name;
    }

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
}
