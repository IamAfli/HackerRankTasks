package com.epam.hakerrank.t18;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfStairs = in.nextInt();
        for(int i = 0; i < numberOfStairs; i++){
            int n = in.nextInt();

            int result = findPossibleVariants(n);
            System.out.println(result);
        }
    }

    static int findPossibleVariants(int n) {
        throw new UnsupportedOperationException();
    }
}
