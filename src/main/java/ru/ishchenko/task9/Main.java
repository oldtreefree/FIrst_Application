package ru.ishchenko.task9;


public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        System.out.println("Animal type: " + dog.getName());
        Animal cat = new Cat();
        System.out.println("Animal type: " + cat.getName());
        Animal duck = new Duck();
        System.out.println("Animal type: " + duck.getName());


        System.out.println();
        Human runner = new Runner();
        System.out.print("Бегун " + runner.getName() + " ");
        runner.printStateRun(true);
        runner.printStateSwim(false);

        System.out.println();
        Human swimmer = new Swimmer();
        System.out.print("Пловец " + swimmer.getName() + " ");
        swimmer.printStateSwim(true);
        swimmer.printStateRun(false);


    }
}

