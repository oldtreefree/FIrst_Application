package ru.ishchenko.task7;

public class Wallet {

    private int balance = 0;

    public boolean isCheckBalance(int money) {
        return balance >= money;
    }

    public void addBalance(int money) {
        balance += money;
    }

    public void subtractBalance(int money) {
        balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}