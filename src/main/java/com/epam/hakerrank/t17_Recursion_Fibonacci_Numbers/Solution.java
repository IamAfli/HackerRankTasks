package com.epam.hakerrank.t17_Recursion_Fibonacci_Numbers;

import java.util.Scanner;

public class Solution {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1){
            return n;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(n));
    }
}
