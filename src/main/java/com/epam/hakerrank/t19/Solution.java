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
    }
}
