package com.epam.hakerrank.t16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int i = 0; i < p; i++){
            int n = in.nextInt();

            boolean result = isPrime(n);

            System.out.println(result ? "Prime" : "Not Prime");
        }
    }

    static boolean isPrime(int n) {
        throw new UnsupportedOperationException();
    }
}
