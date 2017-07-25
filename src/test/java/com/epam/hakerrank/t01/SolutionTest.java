package com.epam.hakerrank.t01;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    private Solution app;
    private int[] array;

    @Before
    public void init() {
        app = new Solution();
    }

    @Test
    public void testLeftRotateMethod() {
        int array_size = 5;
        int arrayShift = 4;

        fillArray(array_size);

        app.performArrayLeftRotate(array, arrayShift);

        int[] expectedArray = new int[5];
        expectedArray[0] = 5;
        expectedArray[1] = 1;
        expectedArray[2] = 2;
        expectedArray[3] = 3;
        expectedArray[4] = 4;

        assertThat(array, is(expectedArray));
    }

    @Test
    public void testLeftRotateMethodWorkWithSingleElementArray() {
        int array_size = 1;
        int arrayShift = 1;

        fillArray(array_size);

        app.performArrayLeftRotate(array, arrayShift);

        int[] expectedArray = new int[1];
        expectedArray[0] = 1;

        assertThat(array, is(expectedArray));
    }

    private void fillArray(int array_size) {
        array = new int[array_size];

        IntStream.range(0, array_size).forEach(
                i -> array[i] = i + 1
        );
    }
}