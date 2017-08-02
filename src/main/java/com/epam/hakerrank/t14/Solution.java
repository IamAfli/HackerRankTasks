package com.epam.hakerrank.t14;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int height = in.nextInt();
        int width = in.nextInt();

        int grid[][] = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = in.nextInt();
            }
        }

        int result = calculateBiggestRegionSize(grid);

        System.out.println(result);
    }

    static int calculateBiggestRegionSize(int[][] grid) {
        throw new UnsupportedOperationException();
    }
}
