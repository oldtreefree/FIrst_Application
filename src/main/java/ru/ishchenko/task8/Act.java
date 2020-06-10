package ru.ishchenko.task8;

import java.util.Date;

public class Act {
    private int number;
    private Date date;
    private String[] myArray = new String[4];

    public Act() {
        myArray[0] = "Фрукты";
        myArray[1] = "Овощи";
        myArray[2] = "Напитки";
        myArray[3] = "Снеки";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getMyArray() {
        return myArray;
    }

    public void setMyArray(String[] myArray) {
        this.myArray = myArray;
    }
}
