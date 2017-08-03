package com.epam.hakerrank.t08_Heaps_Find_the_Running_Median;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testThatCalculateMedianReturnsCorrectMedian(){
        int[] array = {12, 4, 5, 3, 8, 7};
        double[] expectedResult = {12, 8, 5, 4.5, 5, 6};

        for (int i = 0; i < array.length; i++) {
            Solution.addNumber(array[i]);
            double result = Solution.calculateMedian();

            assertThat(result, is(expectedResult[i]));
        }
    }
}