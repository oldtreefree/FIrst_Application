package ru.ishchenko.task27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = getIntegers();
        System.out.println(list.toString());
        for (int i = 0; i < 10; i++) {
            System.out.print(recursion(i) + " ");
        }
    }

    private static List<Integer> getIntegers() {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i < 10; i++) {
            list.add(i, list.get(i - 1) + list.get(i - 2));
        }
        return list;
    }

    private static int recursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }
}