package com.epam.hakerrank.t19;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dollars = in.nextInt();
        int coinVariety = in.nextInt();

        int coins[] = new int[coinVariety];
        for (int i = 0; i < coinVariety; i++) {
            coins[i] = in.nextInt();
        }

        int result = possibilitiesNumber(dollars, coins);
        System.out.println(result);
    }

    static int possibilitiesNumber(int dollars, int[] coins) {
        int[] DP = new int[dollars + 1];
        DP[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j < DP.length; j++) {
                DP[j] += DP[j - coin];
            }
        }

        return DP[dollars];
    }
}
