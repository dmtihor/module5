package com.dmtihor;

public class MinMaxValues {
    public static void searchMinValue(int[] array) {
        for (int a : array) {
            int min = Integer.MAX_VALUE;
            if (a < min) {
                min = a;
            }
        }
    }

    public static void searchMaxValue(int[] array) {
        for (int a : array) {
            int max = Integer.MIN_VALUE;
            if (a > max) {
                max = a;
            }
        }
    }
}
