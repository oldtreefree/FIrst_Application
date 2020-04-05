package ru.ishchenko.task4;

class Point {
    protected int x, y;

    public Point() {
        x = y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void Draw() {
        System.out.println("A point is drawn in the position x: " + x + " y: " + y);
    }

}

class Pixel extends Point {

    private int color;

    public Pixel() {
        color = 0;
    }

    public Pixel(int x, int y) {
        super(x, y);
        color = 0;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int c) {
        color = c;
    }

    @Override
    public int getX() {
        return 1920 - x;
    }
}


class Line extends Point {

    @Override
    public void Draw() {
        System.out.println("Линия выведена");
    }
}


class Box extends Point {

    @Override
    public void Draw() {
        System.out.println("Коробка");
    }
}


class Circle extends Point {

    @Override
    public void Draw() {
        System.out.println("Циркуль");
    }
}

public class Main {
    public static void main(String[] args) {
        Point a = new Point(30, 40);
        System.out.println(a.getX());
        System.out.println(a.getY());

        a.Draw();

        Pixel b = new Pixel(20, 50);

        b.setColor(255);
        System.out.println(b.getX());
        System.out.println(b.getY());
        System.out.println(b.getColor());

        Point p[] = new Point[4];
        p[0]= new Point();
        p[1]= new Line();
        p[2]= new Box();
        p[3]= new Circle();

        for (int i = 0; i < p.length; i++) {
            p[i].Draw();
        }

    }
}
