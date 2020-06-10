package ru.ishchenko.task8;

import java.util.Date;
import java.util.Scanner;

public class Main extends Contract {
    public static void main(String[] args) {

        // Калькулятор
        Scanner input = new Scanner(System.in);
        System.out.println("1 число");
        double i = input.nextDouble();
        System.out.println("2 число");
        double i2 = input.nextDouble();
        System.out.println(Calculator.add(i, i2));
        System.out.println(Calculator.dec(i, i2));
        System.out.println(Calculator.mul(i, i2));
        System.out.println(Calculator.sub(i, i2));
        System.out.println(Calculator.percent(i, i2));

        // Счетчик количества создаваемых объектов
        Meter a1 = new Meter();
        Meter a2 = new Meter();
        Meter a3 = new Meter();
        Meter a4 = new Meter();
        Meter a5 = new Meter();
        System.out.println("Кол-во объектов: " + Meter.getI());

        // Поэксперементировать с ключевым словом final
        System.out.println("Final");
        FinalTest finalTest = new FinalTest(6);
        System.out.println(finalTest.getA());

        Act act = new Act();
        act.setDate(new Date());
        act.setNumber(1);
        IConverter converter = new Converter();
        Contract contract = converter.actToContract(act);
        System.out.println(contract.toString());
    }
}
