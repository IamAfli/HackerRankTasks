package com.epam.hakerrank.t01_Arrays_Left_Rotation;

import java.util.Objects;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution app = new Solution();

        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        int arrayShift = in.nextInt();

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextInt();
        }

        app.performArrayLeftRotate(array, arrayShift);

        printArray(array);
    }

    public void performArrayLeftRotate(int[] array, int arrayShift) {
        Objects.requireNonNull(array);
        if (arrayShift > array.length){
            throw new IllegalArgumentException(
                    String.format("Array shift [%d] can't be greater than array length [%d]",
                            arrayShift,
                            array.length)
            );
        }

        for (int i = 0; i < arrayShift; i++) {
            shiftLeftByOne(array);
        }
    }

    private void shiftLeftByOne(int[] array) {
        int tmp = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = tmp;
    }

    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
