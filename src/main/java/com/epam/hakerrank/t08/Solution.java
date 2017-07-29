package com.epam.hakerrank.t08;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int listSize = in.nextInt();
        int[] numbers = new int[listSize];

        for (int i = 0; i < listSize; i++) {
            numbers[i] = in.nextInt();

            double median = calculateMedian(numbers, i + 1);

            System.out.format("%.1f%n", median);
        }
    }

    static double calculateMedian(int[] numbers, int size) {
        int[] tmp = Arrays.copyOf(numbers, size);

        Arrays.sort(tmp);

        double result = tmp.length % 2 == 1 ?
                tmp[tmp.length / 2] :
                (tmp[tmp.length / 2 - 1] + tmp[tmp.length / 2]) / 2.0;

        System.arraycopy(tmp, 0, numbers, 0, tmp.length);

        return result;
    }
}
