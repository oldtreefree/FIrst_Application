package ru.ishchenko.task9;


interface Fly {
    boolean FLY = true;
    boolean NOTFLY = false;

    void printStateFly(boolean f);
}

interface Run {
    boolean RUN = true;
    boolean NOTRUN = false;

    void printStateRun(boolean r);
}

interface Swim {
    boolean SWIM = true;
    boolean NOTSWIM = false;

    void printStateSwim(boolean s);

}


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Leo");
        dog.display();
        Cat cat = new Cat("Jack");
        cat.display();
        Duck duck = new Duck("Jane");
        duck.display();


        System.out.println();
        Human runner = new Runner("Кирилл");
        System.out.print("Бегун " + runner.getName() + " ");
        runner.printStateRun(true);
        runner.printStateSwim(false);

        System.out.println();
        Human swimmer = new Swimmer("Антон");
        System.out.print("Пловец " + swimmer.getName() + " ");
        swimmer.printStateSwim(true);
        swimmer.printStateRun(false);

    }
}

