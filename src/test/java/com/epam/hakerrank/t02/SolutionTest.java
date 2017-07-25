package com.epam.hakerrank.t02;

import org.junit.Test;

import static com.epam.hakerrank.t02.Solution.numberNeeded;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testNumberNeededWorksProperlyWhenStringsAreAnagrams(){
        String a = "abc";
        String b = "bca";

        int result = numberNeeded(a, b);

        int expected = 0;

        assertThat(result, is(expected));
    }

    @Test
    public void testNumberNeededWorksProperlyWhenStringsSizeIsSame(){
        String a = "abc";
        String b = "cde";

        int result = numberNeeded(a, b);

        int expected = 4;

        assertThat(result, is(expected));
    }

    @Test
    public void testNumberNeededWorksProperlyWhenFirstStringIsLonger(){
        String a = "abcde";
        String b = "cde";

        int result = numberNeeded(a, b);

        int expected = 2;

        assertThat(result, is(expected));
    }

    @Test
    public void testNumberNeededWorksProperlyWhenSecondStringIsLonger(){
        String a = "abc";
        String b = "cdefg";

        int result = numberNeeded(a, b);

        int expected = 6;

        assertThat(result, is(expected));
    }

    @Test(expected = NullPointerException.class)
    public void testNumberNeededThrowsNPEIfFirstStringIsNull(){
        String a = null;
        String b = "cdefg";

        numberNeeded(a, b);
    }

    @Test(expected = NullPointerException.class)
    public void testNumberNeededThrowsNPEIfSecondStringIsNull(){
        String a = "abc";
        String b = null;

        numberNeeded(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberNeededThrowsExceptionIfFirstStringIsEmpty(){
        String a = "";
        String b = "cdefg";

        numberNeeded(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberNeededThrowsExceptionIfSecondStringIsEmpty(){
        String a = "abc";
        String b = "";

        numberNeeded(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberNeededThrowsExceptionIfFirstStringIsTooLong(){
        StringBuilder firstStringSB = new StringBuilder();
        for (int i = 0; i < Solution.MAX_WORD_LENGTH + 1; i++) {
            firstStringSB.append("a");
        }

        String a = firstStringSB.toString();
        String b = "cdefg";

        numberNeeded(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberNeededThrowsExceptionIfSecondStringIsTooLong(){
        StringBuilder secondStringSB = new StringBuilder();
        for (int i = 0; i < Solution.MAX_WORD_LENGTH + 1; i++) {
            secondStringSB.append("a");
        }

        String a = "abc";
        String b = secondStringSB.toString();

        numberNeeded(a, b);
    }
}