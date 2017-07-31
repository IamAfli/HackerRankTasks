package com.epam.hakerrank.t18;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testCase1(){
        int result = Solution.findPossibleVariants(1);
        int expected = 1;

        assertThat(result, is(expected));
    }

    @Test
    public void testCase2(){
        int result = Solution.findPossibleVariants(3);
        int expected = 4;

        assertThat(result, is(expected));
    }

    @Test
    public void testCase3(){
        int result = Solution.findPossibleVariants(7);
        int expected = 44;

        assertThat(result, is(expected));
    }
}