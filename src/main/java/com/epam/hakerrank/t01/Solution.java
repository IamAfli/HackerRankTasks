package com.epam.hakerrank.t01;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        int arrayShift = in.nextInt();

        int a[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            a[i] = in.nextInt();
        }
    }

    public void performArrayLeftRotate(int[] array, int arrayShift) {
        for (int i = 0; i < arrayShift; i++) {
            shiftLeftByOne(array);
        }
    }

    private void shiftLeftByOne(int[] array) {
        int tmp = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = tmp;
    }
}
