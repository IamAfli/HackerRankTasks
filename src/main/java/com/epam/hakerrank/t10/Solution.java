package com.epam.hakerrank.t10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] array = getArrayFromKeyboard();

        int totalNumberOfSwaps = bubbleSort(array);

        System.out.printf("Array is sorted in %d swaps.%n", totalNumberOfSwaps);
        System.out.printf("First Element: %d%n", array[0]);
        System.out.printf("Last Element: %d%n", array[array.length - 1]);
    }

    public static int[] getArrayFromKeyboard() {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = sc.nextInt();
        }

        sc.close();

        return result;
    }

    private static int bubbleSort(int[] array) {
        int totalNumberOfSwaps = 0;
        for (int i = 0; i < array.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < array.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    numberOfSwaps++;
                }
            }

            totalNumberOfSwaps += numberOfSwaps;

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        return totalNumberOfSwaps;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
