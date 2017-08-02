package com.epam.hakerrank.t12;

import java.util.Scanner;

public class Solution {

    static long countInversions(int[] array) {
        int[] arrayCopy = array.clone();
        return countInversions(array, 0, array.length - 1, arrayCopy);
    }

    private static long countInversions(int[] array, int startInclusive, int endExclusive, int[] arrayCopy) {
        if (startInclusive >= endExclusive) {
            return 0;
        }

        int mid = startInclusive + (endExclusive - startInclusive) / 2;

        long count = 0;
        count += countInversions(arrayCopy, startInclusive, mid, array);
        count += countInversions(arrayCopy, mid + 1, endExclusive, array);
        count += merge(array, startInclusive, mid, endExclusive, arrayCopy);

        return count;
    }

    private static long merge(int[] array, int startInclusive, int mid, int endExclusive, int[] arrayCopy) {
        long count = 0;

        int i = startInclusive;
        int j = mid + 1;
        int k = startInclusive;

        while (i <= mid || j <= endExclusive) {
            if (i > mid) {
                array[k++] = arrayCopy[j++];
            } else if (j > endExclusive) {
                array[k++] = arrayCopy[i++];
            } else if (arrayCopy[i] <= arrayCopy[j]) {
                array[k++] = arrayCopy[i++];
            } else {
                array[k++] = arrayCopy[j++];
                count += mid + 1 - i;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfArrays = in.nextInt();

        for (int i = 0; i < numberOfArrays; i++) {
            int arrayLength = in.nextInt();
            int[] array = new int[arrayLength];

            for (int j = 0; j < arrayLength; j++) {
                array[j] = in.nextInt();
            }

            long result = countInversions(array);
            System.out.println(result);
        }

        in.close();
    }
}
