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
        Arrays.sort(numbers, 0, size);

        double result = size % 2 == 1 ?
                numbers[size / 2] :
                (numbers[size / 2 - 1] + numbers[size / 2]) / 2.0;

        return result;
    }
}
