package com.epam.hakerrank.t19;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase1() {
        int dollars = 4;
        int[] coins = {1, 2, 3};

        int result = Solution.possibilitiesNumber(dollars, coins);
        int expected = 4;

        assertThat(result, is(expected));
    }

    @Test
    public void testCase2() {
        int dollars = 10;
        int[] coins = {2,5,3,6};

        int result = Solution.possibilitiesNumber(dollars, coins);
        int expected = 5;

        assertThat(result, is(expected));
    }
}