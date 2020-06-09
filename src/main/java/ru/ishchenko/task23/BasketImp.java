package ru.ishchenko.task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasketImp implements Basket {

    private List<Product> productsList;

    public BasketImp() {
        this.productsList = new ArrayList<>();
    }

    public void showProduct() {
        System.out.println(productsList.toString());
    }

    @Override
    public void addProduct(String product, int quantity) {
        productsList.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        Iterator<Product> iterator = productsList.iterator();
        while (iterator.hasNext()) {
            Product product1 = iterator.next();
            if (product1.getName().equals(product)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product product1 : productsList) {
            if (product1.getName().equals(product)) {
                product1.setQuantity(quantity);
            }
        }
    }

    @Override
    public void clear() {
        productsList.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        for (Product product1 : productsList) {
            list.add(product1.getName());
        }
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product product1 : productsList) {
            if (product1.getName().equals(product)) {
                return product1.getQuantity();
            }
        }
        throw new RuntimeException(String.format("Product not found %s", product));
    }
}