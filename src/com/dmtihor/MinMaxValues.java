package com.dmtihor;

public class MinMaxValues {
    public static int searchMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static int searchMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
