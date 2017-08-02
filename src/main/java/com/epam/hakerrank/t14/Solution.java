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
        int biggestRegion = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                biggestRegion = Math.max(biggestRegion, checkNeighbourCells(grid, i, j));
            }
        }

        return biggestRegion;
    }

    private static int checkNeighbourCells(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) {
            return 0;
        }

        if (grid[i][j] == 0) {
            return 0;
        }

        int count = grid[i][j]--;
        count += checkNeighbourCells(grid, i - 1, j - 1);
        count += checkNeighbourCells(grid, i - 1, j);
        count += checkNeighbourCells(grid, i - 1, j + 1);
        count += checkNeighbourCells(grid, i, j - 1);
        count += checkNeighbourCells(grid, i, j + 1);
        count += checkNeighbourCells(grid, i + 1, j - 1);
        count += checkNeighbourCells(grid, i + 1, j);
        count += checkNeighbourCells(grid, i + 1, j + 1);

        return count;
    }
}
