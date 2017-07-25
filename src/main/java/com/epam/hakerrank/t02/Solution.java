package com.epam.hakerrank.t02;

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

        // TODO: 25/07/17
        throw new UnsupportedOperationException();
    }

    private static void checkStringSize(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException(
                    "Word cant be empty"
            );
        }

        if (word.length() > MAX_WORD_LENGTH){
            throw new IllegalArgumentException(
                    String.format("Word length [%d] can't be more than %d",
                            word.length(),
                            MAX_WORD_LENGTH)
            );
        }
    }
}
