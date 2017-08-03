package com.epam.hakerrank.t05_Stacks_Balanced_Brackets;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testIsBalancedReturnsTrueOnABalancedString1(){
        String input = "{[()]}";

        boolean result = Solution.isBalanced(input);

        assertThat(result, is(true));
    }

    @Test
    public void testIsBalancedReturnsTrueOnABalancedString2(){
        String input = "{{[[(())]]}}";

        boolean result = Solution.isBalanced(input);

        assertThat(result, is(true));
    }

    @Test
    public void testIsBalancedReturnsFalseOnAnUnbalancedString(){
        String input = "{[(])}";

        boolean result = Solution.isBalanced(input);

        assertThat(result, is(false));
    }
}