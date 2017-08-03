package com.epam.hakerrank.t13_Binary_Search_Ice_Cream_Parlor;

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
        int[] result = new int[2];

        for (int i = 0; i < flavors.length - 1; i++) {
            for (int j = i + 1; j < flavors.length; j++) {
                if (flavors[i] + flavors[j] == money) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }

        return result;
    }
}