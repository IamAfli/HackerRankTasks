package com.epam.hakerrank.t19_DP_Coin_Change;

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

        long result = possibilitiesNumber(dollars, coins);
        System.out.println(result);
    }

    static long possibilitiesNumber(int dollars, int[] coins) {
        long[] DP = new long[dollars + 1];
        DP[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j < DP.length; j++) {
                DP[j] += DP[j - coin];
            }
        }

        return DP[dollars];
    }
}
