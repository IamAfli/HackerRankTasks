package com.epam.hakerrank.t03;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    private List<String> magazineWords;
    private List<String> ransomWords;
    private Solution app;

    @Before
    public void init(){
        app = new Solution();

        magazineWords = new LinkedList<>();
        ransomWords = new LinkedList<>();
    }

    @Test
    public void testThatMagazineContainsRansom(){
        Collections.addAll(magazineWords,"give", "me", "one", "grand", "today", "night");
        Collections.addAll(ransomWords,"give", "one", "grand", "today");

        boolean result = app.checkMagazineContainsRansom(magazineWords, ransomWords);

        assertThat(result, is(true));
    }

    @Test
    public void testThatMagazineNotContainsRansom(){
        Collections.addAll(magazineWords,"two", "times", "three", "is", "not", "four");
        Collections.addAll(ransomWords,"two", "times", "two", "is", "four");

        boolean result = app.checkMagazineContainsRansom(magazineWords, ransomWords);

        assertThat(result, is(false));
    }
}