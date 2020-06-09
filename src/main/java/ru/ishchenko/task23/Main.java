package ru.ishchenko.task23;

public class Main {
    public static void main(String[] args) {

        BasketImp basket = new BasketImp();
        basket.addProduct("Сахар", 50);
        basket.addProduct("Молоко", 1);
        basket.addProduct("Бананы", 10);
        basket.addProduct("Мёд", 500);
        basket.addProduct("Конфетки", 15);

        basket.showProduct();
        System.out.println("------------------------------------");

        String honey = "Мёд";

        basket.removeProduct(honey);
        System.out.printf("Удалили %s", honey);
        System.out.println();
        System.out.println("------------------------------------");


        basket.showProduct();
        System.out.println("------------------------------------");

        String candy = "Конфетки";
        basket.updateProductQuantity(candy, 1000);
        basket.showProduct();
        System.out.println("------------------------------------");

        System.out.println(basket.getProducts());
        System.out.println("------------------------------------");

        System.out.printf("Вес у %s = %d \n", candy, basket.getProductQuantity(candy));
        System.out.println("------------------------------------");

        basket.clear();
        System.out.println("Корзина очищена");
        basket.showProduct();

    }
}
