package ru.ishchenko.task22;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public static int[] createArray(int min, int max) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt((max - min) + 1) + min;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;

        }
        System.out.println(Arrays.toString(array));
    }
}

