package ru.ishchenko.task19;


public class Product {

    private String name;
    private double weight;
    private double price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double sum() {
        return getPrice() * getWeight();
    }
}


