package ru.ishchenko.task13;


public class Son {


    public Food getFood(int i) {
        return Food.values()[i];
    }

    public void eat(int i) throws EatException {

        if (getFood(i).isTasty()) {
            System.out.println("Съел " + getFood(i).getName() + " за обе щеки");
        } else {
            throw new EatException("Не захавал.");
        }
    }
}
