package ru.ishchenko.task7;

public enum Product {

    COCA_COLA("Кола", 60),
    MOUNTAIN_D("Моунти Дью", 50),
    PEPSI("Пепси", 65),
    SPRITE("Спрайт", 55);

    private int price;
    private String name;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "№ " + ordinal() + " Название: " + name + " Цена: " + price;
    }


    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

}
