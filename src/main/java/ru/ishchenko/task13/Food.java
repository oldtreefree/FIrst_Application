package ru.ishchenko.task13;

public enum Food {
    PORRIDGE("Каша", true),
    APPLE("Яблоко", true),
    CARROT("Морковь", false),
    MEAT("Мясо", false);

    private String name;
    private boolean tasty;

    Food(String name, boolean tasty) {
        this.name = name;
        this.tasty = tasty;

    }

    public String getName() {
        return name;
    }

    public boolean isTasty() {
        return tasty;
    }

    @Override
    public String toString() {
        return "№:" + ordinal() + " " + name;
    }
}


