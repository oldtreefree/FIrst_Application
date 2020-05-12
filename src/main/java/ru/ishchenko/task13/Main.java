package ru.ishchenko.task13;

public class Main {

    public static void main(String[] args) {
        try {
            new Mom(new Son()).giveFood();
        } catch (EatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Спасибо мама");
        }
    }
}
