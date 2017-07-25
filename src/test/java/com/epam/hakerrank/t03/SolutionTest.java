package com.epam.hakerrank.t03;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    private Map<String, Integer> magazineWords;
    private Map<String, Integer> ransomWords;
    private Solution app;

    @Before
    public void init(){
        app = new Solution();

        magazineWords = new HashMap<>();
        ransomWords = new HashMap<>();
    }

    @Test
    public void testThatMagazineContainsRansom(){
        magazineWords = putwordsIntTheMap("give", "me", "one", "grand", "today", "night");
        ransomWords= putwordsIntTheMap("give", "one", "grand", "today");

        boolean result = app.checkMagazineContainsRansom(magazineWords, ransomWords);

        assertThat(result, is(true));
    }

    private static Map<String, Integer> putwordsIntTheMap(String... words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            Integer wordCount = result.putIfAbsent(word, 1);

            if (wordCount != null) {
                result.put(word, wordCount + 1);
            }
        }

        return result;
    }


    @Test
    public void testThatMagazineNotContainsRansom(){
        magazineWords = putwordsIntTheMap("two", "times", "three", "is", "not", "four");
        ransomWords = putwordsIntTheMap("two", "times", "two", "is", "four");

        boolean result = app.checkMagazineContainsRansom(magazineWords, ransomWords);

        assertThat(result, is(false));
    }
}