package com.dmtihor;

public class Main {
    public static void main(String[] args) {
        int array[] = {3, 2, 1, 4, 5, -6, 7, 8, 4, -2, 2, 4, 8, 8, -9, 6, 3, 2, 1, 9};
        MinMaxValues.searchMinValue(array);
        MinMaxValues.searchMaxValue(array);
        Sorting.bubbleSorting(array);
        Display.dispay(array);
    }
}

