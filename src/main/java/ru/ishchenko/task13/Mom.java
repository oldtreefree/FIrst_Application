package ru.ishchenko.task13;


import java.util.Scanner;

public class Mom {

    private Son son;

    public Mom(Son son) {
        this.son = son;
    }

    public void giveFood() throws EatException {
        System.out.println("Какую дать еду?");
        for (Food s : Food.values()) {
            System.out.println(s.toString());
        }
        Scanner inputNumberFood = new Scanner(System.in);
        int i = inputNumberFood.nextInt();
        if (!checkList(i)) {
            System.out.println("Такой еды нет");
        } else {
            son.eat(i);
        }
    }


    public boolean checkList(int i) {
        return i < Food.values().length || i > 0;
    }


}
