package ru.ishchenko.task21;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public static int[][] createArray(int min, int max) {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = new Random().nextInt((max - min) + 1) + min;
            }
            System.out.println(Arrays.toString(a[i]));
        }
        return a;
    }

    public static void toLeft(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                array[i][j] = array[i][j + 1];
                if (j + 1 == array.length - 1)
                    array[i][j + 1] = 0;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
