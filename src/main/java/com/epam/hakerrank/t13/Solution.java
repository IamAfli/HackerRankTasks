package com.epam.hakerrank.t13;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfTimes = in.nextInt();
        for (int i = 0; i < numberOfTimes; i++) {
            int money = in.nextInt();
            int numberOfFlavors = in.nextInt();

            int[] flavors = new int[numberOfFlavors];
            for (int j = 0; j < numberOfFlavors; j++) {
                flavors[j] = in.nextInt();
            }

            int[] result = findFlavors(money, flavors);
            System.out.format("%d %d%n", result[0], result[1]);
        }
    }

    static int[] findFlavors(int money, int[] flavors) {
        throw new UnsupportedOperationException();
    }
}