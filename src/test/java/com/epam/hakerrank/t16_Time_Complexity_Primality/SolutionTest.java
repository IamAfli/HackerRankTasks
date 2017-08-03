package com.epam.hakerrank.t16_Time_Complexity_Primality;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testCase1(){
        boolean result = Solution.isPrime(12);

        assertThat(result, is(false));
    }

    @Test
    public void testCase2(){
        boolean result = Solution.isPrime(5);

        assertThat(result, is(true));
    }

    @Test
    public void testCase3(){
        boolean result = Solution.isPrime(7);

        assertThat(result, is(true));
    }
}