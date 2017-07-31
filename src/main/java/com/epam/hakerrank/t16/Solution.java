package com.epam.hakerrank.t16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int i = 0; i < p; i++) {
            int n = in.nextInt();

            boolean result = isPrime(n);

            System.out.println(result ? "Prime" : "Not Prime");
        }
    }

    static boolean isPrime(int n) {
        if (n == 1){
            return false;
        } else if (n == 2){
            return true;
        }

        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
