package ru.ishchenko.task25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImp implements Basket {

    private Map<String, Integer> productsList;

    public BasketImp() {
        this.productsList = new HashMap<>();
    }

    public void showProduct() {
        System.out.println(productsList.toString());
    }

    @Override
    public void addProduct(String product, int quantity) {
        productsList.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        productsList.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        productsList.replace(product, quantity);
    }

    @Override
    public void clear() {
        productsList.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(productsList.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return productsList.get(product);
    }
}