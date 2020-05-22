package ru.ishchenko.task19;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.showReceipt(Main.class.getClassLoader().getResource("task19/products.txt").getPath());
    }
}

