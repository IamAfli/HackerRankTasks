package com.epam.hakerrank.t08;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testThatCalculateMedianReturnsCorrectMedian(){
        int[] array = {12, 4, 5, 3, 8, 7};
        double[] expectedResult = {12, 8, 5, 4.5, 5, 6};

        for (int i = 0; i < array.length; i++) {
            double result = Solution.calculateMedian(
                    Arrays.copyOf(array, i+1),
                    i+1);

            assertThat(result, is(expectedResult[i]));
        }
    }
}