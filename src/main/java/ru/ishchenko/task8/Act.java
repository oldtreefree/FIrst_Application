package ru.ishchenko.task8;

public class Act {
    private int number;
    private int date;
    static String[] myArray = new String[4];

    public static void A() {
        myArray[0] = "Фрукты";
        myArray[1] = "Овощи";
        myArray[2] = "Напитки";
        myArray[3] = "Снеки";

        System.out.println(myArray[2]);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public static String[] getMyArray() {
        return myArray;
    }

    public static void setMyArray(String[] myArray) {
        Act.myArray = myArray;
    }
}
