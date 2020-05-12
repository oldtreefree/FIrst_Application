package ru.ishchenko.task8;

public final class FinalTest {
    private final int a;

    public FinalTest(int a) {
        this.a = a;
    }

    public final void show() {
        System.out.println("final метод");
    }

    public int getA() {
        return a;
    }
}
