package com.epam.hakerrank.t13_Binary_Search_Ice_Cream_Parlor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase() {
        int money = 4;
        int[] flavors = {1, 4, 5, 3, 2};

        int[] result = Solution.findFlavors(money, flavors);

        int[] expected = {1, 4};

        assertThat(result, is(expected));
    }

    @Test
    public void testCase2() {
        int money = 4;
        int[] flavors = {2, 2, 4, 3};

        int[] result = Solution.findFlavors(money, flavors);

        int[] expected = {1, 2};

        assertThat(result, is(expected));
    }
}