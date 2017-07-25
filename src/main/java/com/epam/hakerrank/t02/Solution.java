package com.epam.hakerrank.t02;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Solution {

    public static final int MAX_WORD_LENGTH = 10_000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String first, String second) {
        Objects.requireNonNull(first);
        Objects.requireNonNull(second);

        checkStringSize(first);
        checkStringSize(second);

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        int result = 0;
        int i = 0;
        int j = 0;
        for (; i < firstChars.length && j < secondChars.length; ) {
            char a = firstChars[i];
            char b = secondChars[j];

            if (a < b) {
                j--;
                result++;
            } else if (a > b) {
                i--;
                result++;
            }

            i++;
            j++;
        }

        result += firstChars.length - i + secondChars.length - j;

        return result;
    }

    private static void checkStringSize(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException(
                    "Word cant be empty"
            );
        }

        if (word.length() > MAX_WORD_LENGTH) {
            throw new IllegalArgumentException(
                    String.format("Word length [%d] can't be more than %d",
                            word.length(),
                            MAX_WORD_LENGTH)
            );
        }
    }
}
