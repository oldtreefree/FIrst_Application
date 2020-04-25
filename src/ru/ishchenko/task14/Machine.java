package ru.ishchenko.task14;

import org.apache.log4j.Logger;

import java.util.Scanner;


public class Machine {
    private final static Logger log = Logger.getLogger(Machine.class);
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

    public Product getProduct(int i) {
        Product product = null;
        try {
            product = Product.values()[i];
        } catch (ArrayIndexOutOfBoundsException ex) {
            log.fatal("Такого напитка нет");
            ex.printStackTrace();
            System.exit(0);
        }
        return product;
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
                    log.info("Введите количество денег");
                    Scanner inputWallet = new Scanner(System.in);
                    i = inputWallet.nextInt();
                    if (i <= 0) {
                        log.warn("Нельзя ввести денег 0 или менее");
                        continue;
                    }
                    getWallet().addBalance(i);
                    log.info("Ваш баланс: " + getWallet().getBalance());
                    break;

                case 2:
                    showList();
                    break;
                case 3:
                    if (!getWallet().isCheckBalance(0)) {
                        log.warn("У вас недостаточно средств. Пополни свой баланс");
                        continue;
                    }
                    log.info("Введите номер напитка");
                    Scanner inputNumberProduct = new Scanner(System.in);
                    i = inputNumberProduct.nextInt();

                    if (!getWallet().isCheckBalance(getProduct(i).getPrice())) {
                        log.warn("У вас недостаточно средств. Пополни свой баланс");
                        continue;
                    }
                    getWallet().subtractBalance(getProduct(i).getPrice());
                    log.info("Вы получили товар " + getProduct(i).getName());
                    if (getWallet().getBalance() > 0) {
                        log.info("Ваш сдача " + getWallet().getBalance());
                    } else {
                        log.info("У вас больше нет денег");
                        log.info("Приятного аппетита!");
                    }
                    break;
            }
        }
    }
}
