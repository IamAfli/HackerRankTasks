package com.epam.hakerrank.t05;

import java.util.Scanner;

public class Solution {

    public static boolean isBalanced(String expression) {
        // TODO: 26/07/17
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfStrings = in.nextInt();

        for (int i = 0; i < numberOfStrings; i++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
