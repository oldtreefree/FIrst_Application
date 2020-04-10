package ru.ishchenko.task7;

import java.util.Scanner;

public class Machine {
    private final static int EXIT = 4;
    private int i;
    private Wallet wallet;


    public Machine() {
        wallet = new Wallet();
    }

    public void showList() {
        System.out.println("------------МЕНЮ-------------");
        for (Product s : Product.values()) {
            System.out.println(s.toString());
        }
        System.out.println("-----------------------------");

    }

    public boolean checkList(int i) {
        if (i > Product.values().length || i < 0)
            return false;
        return true;
    }

    public Product getProduct(int i) {
        return Product.values()[i];
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void run() {
        while (i != EXIT) {
            System.out.println("1 | Пополнить баланс");
            System.out.println("2 | Посмотреть меню");
            System.out.println("3 | Купить напиток");
            System.out.println("4 | Exit");
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Введите количество денег");
                    Scanner inputWallet = new Scanner(System.in);
                    i = inputWallet.nextInt();
                    if (i <= 0) {
                        System.out.println("Нельзя ввести денег 0 или менее");
                        continue;
                    }
                    getWallet().addBalance(i);
                    System.out.println("Ваш баланс: " + getWallet().getBalance());
                    break;

                case 2:
                    showList();
                    break;
                case 3:
                    if (!getWallet().isCheckBalance(0)) {
                        System.out.println("У вас недостаточно средств. Пополни свой баланс");
                        continue;
                    }
                    System.out.println("Введите номер напитка");
                    Scanner inputNumberProduct = new Scanner(System.in);
                    i = inputNumberProduct.nextInt();
                    if (!checkList(i)) {
                        System.out.println("Такого напитка нет");
                        continue;
                    }
                    if (!getWallet().isCheckBalance(getProduct(i).getPrice())) {
                        System.out.println("У вас недостаточно средств. Пополни свой баланс");
                        continue;
                    }
                    getWallet().subtractBalance(getProduct(i).getPrice());
                    System.out.println("Вы получили товар " + getProduct(i).getName());
                    if (getWallet().getBalance() > 0) {
                        System.out.println("Ваш сдача " + getWallet().getBalance());
                    } else {
                        System.out.println("У вас больше нет денег");
                        System.out.println("Приятного аппетита!");
                    }
                    break;
            }
        }
    }
}
