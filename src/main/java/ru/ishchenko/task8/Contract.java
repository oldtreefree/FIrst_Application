package ru.ishchenko.task8;

import java.util.Arrays;
import java.util.Date;

public class Contract {
    private int number;
    private Date date;
    private String[] myArray = new String[4];

    public Contract() {
        myArray[0] = "Диски";
        myArray[1] = "Овощи";
        myArray[2] = "Напитки";
        myArray[3] = "Покрышки";
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

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", myArray=" + Arrays.toString(myArray) +
                '}';
    }
}
