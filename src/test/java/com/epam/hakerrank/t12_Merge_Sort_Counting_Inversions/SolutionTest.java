package com.epam.hakerrank.t12_Merge_Sort_Counting_Inversions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testCase1(){
        int[] array = {1, 1, 1, 2, 3};

        long result = Solution.countInversions(array);

        long expected = 0;

        assertThat(result, is(expected));
    }

    @Test
    public void testCase2(){
        int[] array = {2, 1, 3, 1, 2};

        long result = Solution.countInversions(array);

        long expected = 4;

        assertThat(result, is(expected));
    }
}