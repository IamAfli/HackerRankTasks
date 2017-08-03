package com.epam.hakerrank.t14_DFS_Connected_Cell_in_a_Grid;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testCase1() {
        int[][] grid = {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 0}
        };

        int result = Solution.calculateBiggestRegionSize(grid);

        int expected = 5;

        assertThat(result, is(expected));
    }
}