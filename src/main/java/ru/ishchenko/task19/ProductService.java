package ru.ishchenko.task19;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProductService {

    private double totalPrice = 0;

    public void showReceipt(String path) {

        System.out.println(String.format("%-15s %9s %8s %13s", "Наименование", "Цена", "Кол-во", "Стоимость"));
        System.out.println("================================================");

        File file = new File(path);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                Product product = new Product();
                String s;
                int q = 0;
                while ((s = br.readLine()) != null) {

                    switch (q) {
                        case 0:
                            product.setName(s);
                            break;
                        case 1:
                            product.setWeight(Double.parseDouble(s));
                            break;
                        case 2:
                            product.setPrice(Double.parseDouble(s));
                            break;
                    }
                    q++;

                    if (q == 3) {
                        System.out.println(String.format("%-15s %9s %2s %5s %5s %7.2f", product.getName(), product.getPrice(), "x", product.getWeight(), "=", product.sum()));
                        totalPrice += product.sum();
                        q = 0;
                    }
                }
                System.out.println("================================================");
                System.out.printf("Итого: %33s %.2f", "", totalPrice);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файла с продуктами не сущетвует!");
        }

    }
}
