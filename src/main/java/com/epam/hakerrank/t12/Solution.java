package com.epam.hakerrank.t12;

import java.util.Scanner;

public class Solution {

    static long countInversions(int[] arr) {
        // Complete this function
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfArrays = in.nextInt();

        for(int i = 0; i < numberOfArrays; i++){
            int arrayLength = in.nextInt();
            int[] array = new int[arrayLength];

            for(int j = 0; j < arrayLength; j++){
                array[j] = in.nextInt();
            }

            long result = countInversions(array);
            System.out.println(result);
        }

        in.close();
    }
}
